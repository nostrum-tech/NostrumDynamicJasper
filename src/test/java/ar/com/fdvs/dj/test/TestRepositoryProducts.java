/*
 * DynamicJasper: A library for creating reports dynamically by specifying
 * columns, groups, styles, etc. at runtime. It also saves a lot of development
 * time in many cases! (http://sourceforge.net/projects/dynamicjasper)
 *
 * Copyright (C) 2008  FDV Solutions (http://www.fdvsolutions.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 *
 * License as published by the Free Software Foundation; either
 *
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *
 */

package ar.com.fdvs.dj.test;

import ar.com.fdvs.dj.test.domain.Product;
import ar.com.fdvs.dj.util.SortUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TestRepositoryProducts {

	public static List<Product> getDummyCollection(){

		SimpleDateFormat dateFormat = new SimpleDateFormat();
		dateFormat.applyPattern("dd/MM/yyyy");

		List<Product> col =  new ArrayList<Product>();

		//The collection is ordered by State, Branch and Product Line
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Florida","Main Street", Long.valueOf("2500"), Float.valueOf("10000")));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Florida","Railway Station", Long.valueOf("1400"), Float.valueOf("2831.32")));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Florida","Baseball Stadium", Long.valueOf("4000"), Float.valueOf("38347")));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Florida","Shopping Center", Long.valueOf("3000"), Float.valueOf("9482.4")));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","New York","Main Street", Long.valueOf("2500"), Float.valueOf("27475.5")));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","New York","Railway Station", Long.valueOf("1400"), Float.valueOf("3322")));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","New York","Baseball Stadium", Long.valueOf("4000"), Float.valueOf("78482")));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","New York","Shopping Center", Long.valueOf("3000"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Washington","Main Street", Long.valueOf("1500"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Washington","Railway Station", Long.valueOf("8400"), Float.valueOf("2831.32")));
//		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Washington","Baseball Stadium", Long.valueOf("1400"), Float.valueOf("38347")));
//		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Washington","Shopping Center", Long.valueOf("3000"), Float.valueOf("8329.2")));
//		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Arizona","Main Street", Long.valueOf("1500"), Float.valueOf("27475.5")));
//		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Arizona","Railway Station", Long.valueOf("4000"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Arizona CustomExpressions can't be grouped (it doesn't crash, but there's always just 1 group in the output even when there should be more). ","Baseball Stadium", Long.valueOf("3000"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Arizona CustomExpressions can't be grouped (it doesn't crash, but there's always just 1 group in the output even when there should be more). ","Shopping Center", Long.valueOf("1500"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","Florida","Main Street", Long.valueOf("8400"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","Florida","Railway Station", Long.valueOf("1400"), Float.valueOf("2831.32")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","Florida","Baseball Stadium", Long.valueOf("4000"), Float.valueOf("38347")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","Florida","Shopping Center", Long.valueOf("3000"), Float.valueOf("9482.4")));
		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","New York","Main Street", Long.valueOf("1500"), Float.valueOf("8329.2")));
		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","New York","Railway Station", Long.valueOf("2500"), Float.valueOf("27475.5")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","New York","Baseball Stadium", Long.valueOf("1400"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","New York","Shopping Center", Long.valueOf("1500"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","Washington","Main Street", Long.valueOf("2500"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","Washington","Railway Station", Long.valueOf("1400"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","Washington","Baseball Stadium", Long.valueOf("4000"), Float.valueOf("2831.32")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","Washington","Shopping Center", Long.valueOf("3000"), Float.valueOf("38347")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","Arizona CustomExpressions can't be grouped (it doesn't crash, but there's always just 1 group in the output even when there should be more). ","Main Street", Long.valueOf("4000"), Float.valueOf("9482.4")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","Arizona CustomExpressions can't be grouped (it doesn't crash, but there's always just 1 group in the output even when there should be more). ","Railway Station", Long.valueOf("3000"), Float.valueOf("8329.2")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","Arizona CustomExpressions can't be grouped (it doesn't crash, but there's always just 1 group in the output even when there should be more). ","Baseball Stadium", Long.valueOf("1500"), Float.valueOf("27475.5")));
//		col.add(new Product( Long.valueOf("2"),"book","The Sum of All Fears","Arizona CustomExpressions can't be grouped (it doesn't crash, but there's always just 1 group in the output even when there should be more). ","Shopping Center", Long.valueOf("8400"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Florida","Main Street", Long.valueOf("1400"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Florida","Railway Station", Long.valueOf("4000"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Florida","Baseball Stadium", Long.valueOf("3000"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Florida","Shopping Center", Long.valueOf("1500"), Float.valueOf("2831.32")));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","New York","Main Street", Long.valueOf("2500"), Float.valueOf("38347")));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","New York","Railway Station", Long.valueOf("1400"), Float.valueOf("9482.4")));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","New York","Baseball Stadium", Long.valueOf("1500"), Float.valueOf("8329.2")));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","New York","Shopping Center", Long.valueOf("2500"), Float.valueOf("27475.5")));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Washington","Main Street", Long.valueOf("1400"), Float.valueOf("3322")));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Washington","Railway Station", Long.valueOf("4000"), Float.valueOf("78482")));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Washington","Baseball Stadium", Long.valueOf("3000"), Float.valueOf("5831.32")));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Washington","Shopping Center", Long.valueOf("4000"), Float.valueOf("78482")));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Arizona","Main Street", Long.valueOf("3000"), Float.valueOf("2831.32")));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Arizona","Railway Station", Long.valueOf("1500"), Float.valueOf("38347")));
//		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Arizona","Baseball Stadium", Long.valueOf("8400"), Float.valueOf("9482.4")));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Arizona","Shopping Center", Long.valueOf("1400"), Float.valueOf("8329.2")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","Florida","Main Street", Long.valueOf("4000"), Float.valueOf("27475.5")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","Florida","Railway Station", Long.valueOf("3000"), Float.valueOf("3322")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","Florida","Baseball Stadium", Long.valueOf("1500"), Float.valueOf("78482")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","Florida","Shopping Center", Long.valueOf("2500"), Float.valueOf("5831.32")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","New York","Main Street", Long.valueOf("1400"), Float.valueOf("78482")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","New York","Railway Station", Long.valueOf("1500"), Float.valueOf("2831.32")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","New York","Baseball Stadium", Long.valueOf("2500"), Float.valueOf("38347")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","New York","Shopping Center", Long.valueOf("1400"), Float.valueOf("9482.4")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","Washington","Main Street", Long.valueOf("4000"), Float.valueOf("8329.2")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","Washington","Railway Station", Long.valueOf("3000"), Float.valueOf("27475.5")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","Washington","Baseball Stadium", Long.valueOf("4000"), Float.valueOf("3322")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","Washington","Shopping Center", Long.valueOf("3000"), Float.valueOf("78482")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","Arizona","Main Street", Long.valueOf("1500"), Float.valueOf("5831.32")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","Arizona","Railway Station", Long.valueOf("8400"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","Arizona","Baseball Stadium", Long.valueOf("1400"), Float.valueOf("78482")));
		col.add(new Product( Long.valueOf("4"),"dvd","Titanic","Arizona","Shopping Center", Long.valueOf("4000"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","Florida","Main Street", Long.valueOf("3000"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","Florida","Railway Station", Long.valueOf("1500"), Float.valueOf("2831.32")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","Florida","Baseball Stadium", Long.valueOf("2500"), Float.valueOf("38347")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","Florida","Shopping Center", Long.valueOf("1400"), Float.valueOf("9482.4")));
		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","New York","Main Street", Long.valueOf("1500"), Float.valueOf("8329.2")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","New York","Railway Station", Long.valueOf("2500"), Float.valueOf("27475.5")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","New York","Baseball Stadium", Long.valueOf("1400"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","New York","Shopping Center", Long.valueOf("4000"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","Washington","Main Street", Long.valueOf("3000"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","Washington","Railway Station", Long.valueOf("4000"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","Washington","Baseball Stadium", Long.valueOf("3000"), Float.valueOf("2831.32")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","Washington","Shopping Center", Long.valueOf("1500"), Float.valueOf("38347")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","Arizona","Main Street", Long.valueOf("8400"), Float.valueOf("9482.4")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","Arizona","Railway Station", Long.valueOf("1400"), Float.valueOf("8329.2")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","Arizona","Baseball Stadium", Long.valueOf("4000"), Float.valueOf("27475.5")));
//		col.add(new Product( Long.valueOf("5"),"dvd","Back To the Future","Arizona","Shopping Center", Long.valueOf("3000"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","Florida","Main Street", Long.valueOf("1500"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","Florida","Railway Station", Long.valueOf("2500"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","Florida","Baseball Stadium", Long.valueOf("1400"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","Florida","Shopping Center", Long.valueOf("1500"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","New York","Main Street", Long.valueOf("2500"), Float.valueOf("5831.32")));
		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","New York","Railway Station", Long.valueOf("1400"), Float.valueOf("78482")));
		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","New York","Baseball Stadium", Long.valueOf("4000"), Float.valueOf("2831.32")));
		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","New York","Shopping Center", Long.valueOf("3000"), Float.valueOf("38347")));
		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","Washington","Main Street", Long.valueOf("4000"), Float.valueOf("9482.4")));
		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","Washington","Railway Station", Long.valueOf("3000"), Float.valueOf("8329.2")));
//		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","Washington","Baseball Stadium", Long.valueOf("1500"), Float.valueOf("27475.5")));
//		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","Washington","Shopping Center", Long.valueOf("8400"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","Arizona","Main Street", Long.valueOf("1400"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","Arizona","Railway Station", Long.valueOf("4000"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","Arizona","Baseball Stadium", Long.valueOf("3000"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("6"),"dvd","Monsters Inc","Arizona","Shopping Center", Long.valueOf("1500"), Float.valueOf("2831.32")));
//		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","Florida","Main Street", Long.valueOf("2500"), Float.valueOf("38347")));
//		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","Florida","Railway Station", Long.valueOf("1400"), Float.valueOf("9482.4")));
//		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","Florida","Baseball Stadium", Long.valueOf("1500"), Float.valueOf("8329.2")));
//		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","Florida","Shopping Center", Long.valueOf("2500"), Float.valueOf("27475.5")));
		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","New York","Main Street", Long.valueOf("1400"), Float.valueOf("3322")));
		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","New York","Railway Station", Long.valueOf("4000"), Float.valueOf("78482")));
		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","New York","Baseball Stadium", Long.valueOf("3000"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","New York","Shopping Center", Long.valueOf("4000"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","Washington","Main Street", Long.valueOf("3000"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","Washington","Railway Station", Long.valueOf("1500"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","Washington","Baseball Stadium", Long.valueOf("8400"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","Washington","Shopping Center", Long.valueOf("1400"), Float.valueOf("2831.32")));
//		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","Arizona","Main Street", Long.valueOf("4000"), Float.valueOf("38347")));
//		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","Arizona","Railway Station", Long.valueOf("3000"), Float.valueOf("9482.4")));
//		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","Arizona","Baseball Stadium", Long.valueOf("1500"), Float.valueOf("8329.2")));
//		col.add(new Product( Long.valueOf("7"),"magazine","Sports Illustrated","Arizona","Shopping Center", Long.valueOf("2500"), Float.valueOf("27475.5")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","Florida","Main Street", Long.valueOf("1400"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","Florida","Railway Station", Long.valueOf("1500"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","Florida","Baseball Stadium", Long.valueOf("2500"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","Florida","Shopping Center", Long.valueOf("1400"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","New York","Main Street", Long.valueOf("4000"), Float.valueOf("2831.32")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","New York","Railway Station", Long.valueOf("3000"), Float.valueOf("38347")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","New York","Baseball Stadium", Long.valueOf("4000"), Float.valueOf("9482.4")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","New York","Shopping Center", Long.valueOf("3000"), Float.valueOf("8329.2")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","Washington","Main Street", Long.valueOf("1500"), Float.valueOf("27475.5")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","Washington","Railway Station", Long.valueOf("8400"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","Washington","Baseball Stadium", Long.valueOf("1400"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","Washington","Shopping Center", Long.valueOf("4000"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","Arizona","Main Street", Long.valueOf("3000"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","Arizona","Railway Station", Long.valueOf("1500"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","Arizona","Baseball Stadium", Long.valueOf("2500"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("8"),"magazine","The Economist","Arizona","Shopping Center", Long.valueOf("1400"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","Florida","Main Street", Long.valueOf("1500"), Float.valueOf("2831.32")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","Florida","Railway Station", Long.valueOf("2500"), Float.valueOf("38347")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","Florida","Baseball Stadium", Long.valueOf("1400"), Float.valueOf("9482.4")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","Florida","Shopping Center", Long.valueOf("4000"), Float.valueOf("8329.2")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","New York","Main Street", Long.valueOf("3000"), Float.valueOf("27475.5")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","New York","Railway Station", Long.valueOf("1400"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","New York","Baseball Stadium", Long.valueOf("4000"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","New York","Shopping Center", Long.valueOf("3000"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","Washington","Main Street", Long.valueOf("4000"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","Washington","Railway Station", Long.valueOf("3000"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","Washington","Baseball Stadium", Long.valueOf("1500"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","Washington","Shopping Center", Long.valueOf("8400"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","Arizona","Main Street", Long.valueOf("1400"), Float.valueOf("2831.32")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","Arizona","Railway Station", Long.valueOf("4000"), Float.valueOf("38347")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","Arizona","Baseball Stadium", Long.valueOf("3000"), Float.valueOf("9482.4")));
//		col.add(new Product( Long.valueOf("9"),"magazine","National Geographic","Arizona","Shopping Center", Long.valueOf("1500"), Float.valueOf("8329.2")));
//		col.add(new Product( Long.valueOf("10"),"food","snickers","Florida","Main Street", Long.valueOf("2500"), Float.valueOf("27475.5")));
//		col.add(new Product( Long.valueOf("10"),"food","snickers","Florida","Railway Station", Long.valueOf("1400"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("10"),"food","snickers","Florida","Baseball Stadium", Long.valueOf("1500"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("10"),"food","snickers","Florida","Shopping Center", Long.valueOf("2500"), Float.valueOf("27475.5")));
		col.add(new Product( Long.valueOf("10"),"food","snickers","New York","Main Street", Long.valueOf("1400"), Float.valueOf("3322")));
		col.add(new Product( Long.valueOf("10"),"food","snickers","New York","Railway Station", Long.valueOf("1500"), Float.valueOf("78482")));
		col.add(new Product( Long.valueOf("10"),"food","snickers","New York","Baseball Stadium", Long.valueOf("2500"), Float.valueOf("5831.32")));
//		col.add(new Product( Long.valueOf("10"),"food","snickers","New York","Shopping Center", Long.valueOf("1400"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("10"),"food","snickers","Washington","Main Street", Long.valueOf("4000"), Float.valueOf("2831.32")));
//		col.add(new Product( Long.valueOf("10"),"food","snickers","Washington","Railway Station", Long.valueOf("3000"), Float.valueOf("38347")));
//		col.add(new Product( Long.valueOf("10"),"food","snickers","Washington","Baseball Stadium", Long.valueOf("4000"), Float.valueOf("9482.4")));
//		col.add(new Product( Long.valueOf("10"),"food","snickers","Washington","Shopping Center", Long.valueOf("3000"), Float.valueOf("8329.2")));
//		col.add(new Product( Long.valueOf("10"),"food","snickers","Arizona","Main Street", Long.valueOf("1500"), Float.valueOf("27475.5")));
//		col.add(new Product( Long.valueOf("10"),"food","snickers","Arizona","Railway Station", Long.valueOf("8400"), Float.valueOf("3322")));
//		col.add(new Product( Long.valueOf("10"),"food","snickers","Arizona","Baseball Stadium", Long.valueOf("1400"), Float.valueOf("78482")));
//		col.add(new Product( Long.valueOf("10"),"food","snickers","Arizona","Shopping Center", Long.valueOf("4000"), Float.valueOf("5831.32")));

		return col;
	}
	
	public static List getDummyCollectionSmall(){

		SimpleDateFormat dateFormat = new SimpleDateFormat();
		dateFormat.applyPattern("dd/MM/yyyy");

		List col =  new ArrayList();

		//The collection is ordered by State, Branch and Product Line
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Florida","Main Street", Long.valueOf("250"), Float.valueOf("10000"), true));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Florida","Railway Station", Long.valueOf("400"), Float.valueOf("2831.32"), true));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Florida","Baseball Stadium", Long.valueOf("440"), null, false));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Florida","Shopping Center", Long.valueOf("300"), Float.valueOf("9482.4"), false));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","New York","Main Street", Long.valueOf("500"), Float.valueOf("27475.5"), true));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","New York","Railway Station", Long.valueOf("640"), Float.valueOf("3322"), true));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","New York","Baseball Stadium", Long.valueOf("100"), Float.valueOf("78482"), false));
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","New York","Shopping Center", Long.valueOf("70"), Float.valueOf("5831.32"), false));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Washington","Main Street",null, Float.valueOf("3322"), true));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Washington","Railway Station", Long.valueOf("98"), Float.valueOf("78482"), true));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Washington","Baseball Stadium", Long.valueOf("613"), Float.valueOf("5831.32"), false));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Washington","Shopping Center", Long.valueOf("87"), null, false));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Arizona","Main Street", Long.valueOf("250"), Float.valueOf("2831.32"), true));
		col.add(new Product( Long.valueOf("3"),"book","The Pelican Brief,","Arizona","Railway Station", Long.valueOf("550"), Float.valueOf("38347"), false));

		return col;
	}

	public static List getDummyCollectionSmallVariation1(){

		SimpleDateFormat dateFormat = new SimpleDateFormat();
		dateFormat.applyPattern("dd/MM/yyyy");

		List col =  new ArrayList();

		//The collection is ordered by State, Branch and Product Line
		col.add(new Product( Long.valueOf("1"),"book","Harry Potter 7","Florida","Main Street", Long.valueOf("250"), Float.valueOf("10000"), true));
		col.add(new Product( Long.valueOf("2"),"dvd","Harry Potter 7","Florida","Railway Station", Long.valueOf("400"), Float.valueOf("2831.32"), true));
		col.add(new Product( Long.valueOf("3"),"magazine","Harry Potter 7","Florida","Baseball Stadium", Long.valueOf("440"), null, false));
		col.add(new Product( Long.valueOf("4"),"book","Harry Potter 7","Florida","Shopping Center", Long.valueOf("300"), Float.valueOf("9482.4"), false));
		col.add(new Product( Long.valueOf("5"),"dvd","Harry Potter 7","New York","Main Street", Long.valueOf("500"), Float.valueOf("27475.5"), true));
		col.add(new Product( Long.valueOf("6"),"magazine","Harry Potter 7","New York","Railway Station", Long.valueOf("640"), Float.valueOf("3322"), true));
		col.add(new Product( Long.valueOf("7"),"book","Harry Potter 7","New York","Baseball Stadium", Long.valueOf("100"), Float.valueOf("78482"), false));
		col.add(new Product( Long.valueOf("8"),"dvd","Harry Potter 7","New York","Shopping Center", Long.valueOf("70"), Float.valueOf("5831.32"), false));
		col.add(new Product( Long.valueOf("9"),"magazine","The Pelican Brief,","Washington","Main Street",null, Float.valueOf("3322"), true));
		col.add(new Product( Long.valueOf("10"),"book","The Pelican Brief,","Washington","Railway Station", Long.valueOf("98"), Float.valueOf("78482"), true));
		col.add(new Product( Long.valueOf("11"),"dvd","The Pelican Brief,","Washington","Baseball Stadium", Long.valueOf("613"), Float.valueOf("5831.32"), false));
		col.add(new Product( Long.valueOf("12"),"magazine","The Pelican Brief,","Washington","Shopping Center", Long.valueOf("87"), null, false));
		col.add(new Product( Long.valueOf("13"),"book","The Pelican Brief,","Arizona","Main Street", Long.valueOf("250"), Float.valueOf("2831.32"), true));
		col.add(new Product( Long.valueOf("14"),"dvd","The Pelican Brief,","Arizona","Railway Station", Long.valueOf("550"), Float.valueOf("38347"), false));

		return col;
	}

	public static List getDummyCollectionSorted1(){
		List list = getDummyCollection();
		return SortUtils.sortCollection(list, new String[]{"state","branch","item"});
		
	}	
	
	public static void main(String[] args) {
		System.out.println(getDummyCollectionSorted1());
	}
}
