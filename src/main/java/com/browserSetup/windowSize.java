package com.browserSetup;

import com.base.TestBase;
import org.openqa.selenium.Dimension;

public class windowSize extends TestBase {
    public static void main(String[] args){
        chrome_launch();
        getWindowSize();
        setWindowSize(800,300);
        //chrome_close();
    }
    public static void getWindowSize(){
        int height=driver.manage().window().getSize().getHeight();
        int width=driver.manage().window().getSize().getWidth();
        System.out.println("Full window height: "+height);//840
        System.out.println("Full window width: "+width);//1552
    }
    public static void setWindowSize(int Width,int Height){
        driver.manage().window().setSize(new Dimension( Width,Height));
        int height=driver.manage().window().getSize().getHeight();
        int width=driver.manage().window().getSize().getWidth();
        System.out.println("New window height: "+height);//840
        System.out.println("New window width: "+width);//1552
    }


}
