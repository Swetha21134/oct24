package Pack_webDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KeywordDriven {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
 FileInputStream input=new FileInputStream("C:\\Users\\swetha.yanala\\eclipse-workspace\\sw\\oct2024\\opencart.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		XSSFSheet sheet=workbook.getSheet("Module");
		
		int noofrows=sheet.getPhysicalNumberOfRows();
		
		System.out.println("rows:"+noofrows);
		
		for(int i=0;i<noofrows;i++)
		{
		String moduleexe=sheet.getRow(i).getCell(2).getStringCellValue();
		
		System.out.println("Module exe:"+moduleexe);
		if(moduleexe.equals("Y"))
		{
			String moduleid=sheet.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println(moduleid);
		
		XSSFSheet testcasesheet=workbook.getSheet("Testcase");
        int noofrows1=sheet.getPhysicalNumberOfRows();
		System.out.println("rows:"+noofrows1);
		
		for(int j=0;j<noofrows;j++)
		{
		String testcase_moduleid=testcasesheet.getRow(j).getCell(3).getStringCellValue();
		String testexe=testcasesheet.getRow(j).getCell(2).getStringCellValue();
		if(testcase_moduleid.equals(moduleid)&& testexe.equals("Y"))
		{
			String testcaseid=testcasesheet.getRow(j).getCell(0).getStringCellValue();
		
		System.out.println(testcaseid);
		
		XSSFSheet teststepsheet=workbook.getSheet("Teststep");
        int noofrows2=sheet.getPhysicalNumberOfRows();
		System.out.println("rows:"+noofrows2);
		
		for(int k=0;k<noofrows;k++)
		{
		String teststep_testcaseid=teststepsheet.getRow(k).getCell(4).getStringCellValue();
		String Keyword=teststepsheet.getRow(k).getCell(3).getStringCellValue();
		if(teststep_testcaseid.equals(testcaseid))
		{
			switch(Keyword)
			{
			case"ln":
				login();
			case"ca":
				close();
				
				
			}
		}
		System.out.println(teststep_testcaseid);
		
		
		
	}

}
}
		}
		}
	}

	private static void close() {
		// TODO Auto-generated method stub
		System.out.println("This is close code");
	}

	private static void login() {
		// TODO Auto-generated method stub
		System.out.println("This is login code");
		
	}
}
