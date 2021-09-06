package com.opencart;

import com.base.TestBase;

import java.io.IOException;

public class EndToEnd extends TestBase {
    public static void main(String[] args) throws IOException {
        String HomePage="https://demo.opencart.com/";
        chrome_launch();
        openUrl(HomePage);
        RandomName();
        registration.OpenRegisterPage();
        registration.TC_ValidRegister();
        Logout.logOut();
        login.OpenLoginPage();
        login.TC_Login();
        Logout.logOut();
    }
}
