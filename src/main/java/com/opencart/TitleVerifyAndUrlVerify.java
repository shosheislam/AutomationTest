package com.opencart;

import com.base.TestBase;

public class TitleVerifyAndUrlVerify extends TestBase {
    public static void main(String[] args){
        chrome_launch();
        openUrl("https://demo.opencart.com/");
        login.OpenLoginPage();
        Tc_ValidTitleVerify();
        Tc_ValidUrlVerify();

    }
    public static void Tc_ValidTitleVerify(){
        String ExpectedTitle="Account Login";
        String ActualTitle=driver.getTitle();
        if(ExpectedTitle.equals(ActualTitle)){
            System.out.println("Test Passed,Login Page Open.Titel verify");
        }
        else{
            System.out.println("Test failed,another page open");
        }
    }
    public static void Tc_ValidUrlVerify(){
        String ExpectedUrl="https://demo.opencart.com/index.php?route=account/login";
        String ActualUrl=driver.getCurrentUrl();
        if(ExpectedUrl.equals(ActualUrl)){
            System.out.println("Test Passed,Login Page Open.Url verify");
        }
        else{
            System.out.println("Test failed,another page open");
        }
    }


}
