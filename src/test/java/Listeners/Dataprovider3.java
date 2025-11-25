package Listeners;

import org.testng.annotations.Test;

public class Dataprovider3 {
	@Test(dataProvider="ObjectData[][]",dataProviderClass=DataSupplier.class)
	public void extractdatafroDP3(Object[] s) {
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
		System.out.println();
		
	}

}
