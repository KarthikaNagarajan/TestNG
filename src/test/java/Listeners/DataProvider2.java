package Listeners;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	@Test(dataProvider="String[]")
	public void extractdatafroDP(String s) {
		System.out.println(s);
		
	}
	@Test(dataProvider="ObjectData[]")
	public void extractdatafroDP2(Object s) {
		System.out.println(s);
		
	}
	@Test(dataProvider="ObjectData[][]")
	public void extractdatafroDP3(Object[] s) {
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
		System.out.println();
		
	}
	@Test(dataProvider="ObjectData[][]with2type")
	public void extractdatafroDP4(Object[] s) {
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
		System.out.println();
		
	}
	@Test(dataProvider="Iterator<Object>")
	public void extractdatafroDP5(Object[] s) {
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
		System.out.println();
		
	}
	@Test(dataProvider="Iterator<Object>3")
	public void extractdatafroDP6(Object[] s) {
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
		System.out.println();
		
	}
	
	
	@DataProvider(name="String[]")
	public String[] stringdata() {
		String[] data= {
			"Selenium",
			"TestNg",
			"cucumber"
		};
		
		
		
		return data;
		
	}
	@DataProvider(name="ObjectData[]")
	public Object[] ObjectData() {
		Object[]  data= {
			"Selenium",
			"TestNg",
			"cucumber"
		};
		
		
		
		return data;
		
	}
	@DataProvider(name="ObjectData[][]")
	public Object[][] ObjectData_2DIM() {
		Object[][]  data= new Object[3][2];
			
		data[0][0]=1;
		data[0][1]="java";
		data[1][0]=2;
		data[1][1]="Selenium";
		data[2][0]=3;
		data[2][1]="TestNG";
		
		
		
		
		
		return data;
	}
	@DataProvider(name="ObjectData[][]with2type")
	public Object[][] ObjectData_2DIM2() {
		Object[][]  data= new Object[][] {
			
			{123,"HP"},
			{"lenove",456},
			{"Samsung",678}
		};
		
		
		
		return data;
	}
	
	@DataProvider(name="Iterator<Object>")
	public Iterator<String> IteratorObject() {
		List<String> list=new ArrayList<>();
		list.add("Aviva");
		list.add("Hitachi");
		list.add("Google");
		
		
		
		
		
		return list.iterator();
	}
	
	
	@DataProvider(name="Iterator<Object>3")
	public Iterator<Object[]> IteratorObject3() {
		List<Object[]> list=new ArrayList<>();
		list.add(new Object[]{123,"venku"});

		list.add(new Object[]{456,"venku123"});
		list.add(new Object[]{4568,"venku456"});
		
		
		
		
		return list.iterator();
	}
		
		
	
	

}
