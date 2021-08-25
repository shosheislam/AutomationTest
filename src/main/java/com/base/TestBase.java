package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public static WebDriver driver;
    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    public static void chrome_close(){
        driver.close();
    }
    public static void openUrl(String URL){
        driver.get(URL);
    }
}
