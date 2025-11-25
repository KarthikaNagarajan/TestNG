package Listeners;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelData {
	@DataProvider(name="logindata",parallel=true)
	public String[][] GetData() throws Throwable{
		
		File file=new File("C:\\Users\\Raveena\\OneDrive\\Desktop\\Notes.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook XSW=new XSSFWorkbook(fis);
		XSSFSheet sheet=XSW.cloneSheet(2);
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		int colomns=sheet.getRow(0).getPhysicalNumberOfCells();
		String [][]data=new String[rows-1][colomns];
		
		for(int i=0;i<rows-1;i++) {
			for(int j=0;j<colomns;j++) {
				DataFormatter DF=new DataFormatter();
				//System.out.println(DF.formatCellValue(sheet.getRow(i+1).getCell(j)));
				data[i][j]=DF.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}

			
		}
		
		/*for(String[] dataarr:data) {
			System.out.println(Arrays.toString(dataarr));
		}*/
		return data;
		
		
		
		
		
		
	}
	
}
