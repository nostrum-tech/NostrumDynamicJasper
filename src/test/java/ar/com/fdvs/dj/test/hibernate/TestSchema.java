package ar.com.fdvs.dj.test.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestSchema {

    private static final Log log = LogFactory.getLog(TestSchema.class);
    private static volatile boolean dbInitialized = false;

    public static synchronized void ensureDbInitialized() {
        if (!dbInitialized) {
            try (Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:test_dj_db", "sa", "");
                 Statement stmt = conn.createStatement();
                 InputStream is = TestSchema.class.getResourceAsStream("/hsql/test_db_init.sql")) {
                if (is == null) {
                    throw new RuntimeException("test_db_init.sql not found on classpath");
                }
                String sql = new String(is.readAllBytes(), StandardCharsets.UTF_8);
                for (String statement : sql.split(";")) {
                    String trimmed = statement.trim();
                    if (!trimmed.isEmpty() && !trimmed.startsWith("--")) {
                        stmt.execute(trimmed);
                    }
                }
                dbInitialized = true;
                log.info("Test DB initialized from /hsql/test_db_init.sql");
            } catch (Exception e) {
                throw new RuntimeException("Failed to initialize test DB", e);
            }
        }
    }

    public static void buildConfiguration() {
        ensureDbInitialized();

        Configuration config = new Configuration();
        config.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
        config.setProperty("hibernate.connection.driver_class", "org.hsqldb.jdbc.JDBCDriver");
        config.setProperty("hibernate.connection.url", "jdbc:hsqldb:mem:test_dj_db");
        config.setProperty("hibernate.connection.username", "sa");
        config.setProperty("hibernate.connection.password", "");
        config.setProperty("hibernate.connection.pool_size", "1");
        config.setProperty("hibernate.connection.autocommit", "true");
        config.setProperty("hibernate.show_sql", "true");
        config.addResource("hibernate/customer.hbm.xml");

        HibernateUtil.setSessionFactory(config.buildSessionFactory());
    }

}
