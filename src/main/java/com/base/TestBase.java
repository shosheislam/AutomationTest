package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

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
    public static String RandomName() throws IOException {
        FileOutputStream fis=new FileOutputStream("./src/main/resources/Data.properties");
        Properties prop=new Properties();
        String SALTCHAR="abcdABCD123456";
        StringBuilder salt=new StringBuilder();
        Random rnd=new Random();
        while (salt.length()<6){
            int index=(int)(rnd.nextFloat()*SALTCHAR.length());
            salt.append(SALTCHAR.charAt(index));

        }
        String saltStr= salt.toString().concat("@gmail.com");
        prop.setProperty("RandomName",saltStr);
        prop.store(fis,null);

        return saltStr;

    }



}
