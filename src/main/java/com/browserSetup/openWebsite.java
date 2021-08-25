package com.browserSetup;

import com.base.TestBase;

public class openWebsite extends TestBase {
    public static void main(String[] args){
        chrome_launch();
        openUrl("file:///D:/AutomationTest/website/Your Store.html");
      // chrome_close();

    }

}
