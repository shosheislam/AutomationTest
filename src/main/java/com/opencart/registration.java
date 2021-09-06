package com.opencart;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class registration extends TestBase {

    public static void main(String[] args) throws IOException {
        chrome_launch();
        openUrl("https://demo.opencart.com/");
        OpenRegisterPage();
        RandomName();
        TC_ValidRegister();
       // chrome_close();

    }
    public static void OpenRegisterPage(){
        WebElement MyAccount = driver.findElement(By.linkText("My Account"));
        MyAccount.click();
        WebElement Login=driver.findElement(By.linkText("Register"));
        Login.click();
    }


    //protected static String RandomName(){
        //String SALTCHAR="abcdABCD123456";
        //StringBuilder salt=new StringBuilder();
        //Random rnd=new Random();
        //while (salt.length()<6){
           // int index=(int)(rnd.nextFloat()*SALTCHAR.length());
            //salt.append(SALTCHAR.charAt(index));

        //}
        //String saltStr= salt.toString();
        //return saltStr;

   // }


    public static void TC_ValidRegister() throws IOException {
        FileInputStream fis=new FileInputStream("./src/main/resources/Data.properties");
        Properties prop=new Properties();
        prop.load(fis);

        WebElement FirstName=driver.findElement(By.name("firstname"));
        FirstName.sendKeys("Khadija Akter");
        WebElement LastName=driver.findElement(By.name("lastname"));
        LastName.sendKeys("Shoshe");
        WebElement Email=driver.findElement(By.name("email"));
        Email.sendKeys(prop.getProperty("RandomName"));
        WebElement Telephone=driver.findElement(By.name("telephone"));
        Telephone.sendKeys("01790483");
        WebElement Password=driver.findElement(By.name("password"));
        Password.sendKeys("123456");
        WebElement PasswordConfirm=driver.findElement(By.name("confirm"));
        PasswordConfirm.sendKeys("123456");
        WebElement Subscribe=driver.findElement(By.name("newsletter"));
        Subscribe.click();
        WebElement PrivacyPolicy=driver.findElement(By.name("agree"));
        PrivacyPolicy.click();
        WebElement Continue=driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        Continue.click();









    }

}
