package com.opencart.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
public class Readconfig {
    public String getbrowser() throws IOException {
        Properties prob = new Properties();
        InputStream input = new FileInputStream("C:\\Users\\sarif\\eclipse-workspace\\Oct2024\\src\\test\\resources\\config.properties");
        prob.load(input);
        String browsername = prob.getProperty("browser");
        return browsername;
    }
 
    public static String geturl() throws IOException {
        Properties prob = new Properties();
        InputStream input = new FileInputStream("C:\\Users\\sarif\\eclipse-workspace\\Oct2024\\src\\test\\resources\\config.properties");
        prob.load(input);
        String url = prob.getProperty("url");
        return url;
    }
}
 
