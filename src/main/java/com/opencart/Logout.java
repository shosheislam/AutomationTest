package com.opencart;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Logout extends TestBase {
    public static void main(String[] args) throws IOException {
        chrome_launch();
        openUrl("https://demo.opencart.com/");
        login.OpenLoginPage();
        login.TC_Login();
        logOut();

    }
    public static void logOut(){
        WebElement Logout=driver.findElement(By.linkText("Logout"));
        Logout.click();

    }
}
