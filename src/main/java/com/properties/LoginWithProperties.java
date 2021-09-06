package com.properties;

import com.base.TestBase;
import com.opencart.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginWithProperties extends TestBase {
   public static void main(String[] args) throws IOException {
       FileInputStream fis=new FileInputStream("./src/main/resources/Data.properties");
       Properties prop=new Properties();
       prop.load(fis);
       chrome_launch();
       openUrl("https://demo.opencart.com/");
       login.OpenLoginPage();
       WebElement Email=driver.findElement(By.name("email"));
       Email.sendKeys(prop.getProperty("Email"));
       WebElement Password=driver.findElement(By.name("password"));
       Password.sendKeys(prop.getProperty("Password"));
       WebElement Login=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
       Login.click();

   }

}
