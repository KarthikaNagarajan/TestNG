package Listeners;

import org.testng.annotations.DataProvider;

public class DataSupplier {
	@DataProvider(name="ObjectData[][]",indices= {0,2})
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
}
