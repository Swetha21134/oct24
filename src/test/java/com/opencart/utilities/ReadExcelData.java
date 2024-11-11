package com.opencart.utilities;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
 
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.DataProvider;
 
public class ReadExcelData {
    @DataProvider(name = "login")
    public String[][] readdatafromexcel() throws IOException {
        String[][] data = new String[1][1];
 
            FileInputStream input = new FileInputStream("C:\\JAVA_WS\\JAVA_OCT\\UserDetails.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(input);
            XSSFSheet sheet = workbook.getSheet("login");
 
            int noofrows = sheet.getPhysicalNumberOfRows();
            System.out.println("rows: " + noofrows);
 
            for (int i = 0; i < noofrows; i++) {
                String url = sheet.getRow(i).getCell(0).getStringCellValue();
                String uname = sheet.getRow(i).getCell(1).getStringCellValue();
                String upword = sheet.getRow(i).getCell(2).getStringCellValue();
 
                data[i][0] = uname;
                data[i][1] = upword;
 
                System.out.println("username: " + uname);
                System.out.println("password: " + upword);
            }
 
 
        return data;
    }
}

