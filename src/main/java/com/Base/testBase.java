package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBase {
    public static WebDriver driver; //WebDriver=Interface , driver=reference

    public static void main(String[] args) {
        firefoxLaunch();

    }

    public static void firefoxLaunch(){
        //set driver path: static
        //System.setProperty("webdriver.gecko.driver","E:\\SQA Training BITM\\7th class\\geckodriver-v0.29.1-win64\\geckodriver.exe") ; //firefox

        //set driver path: dynamic
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//src//main//resources//geckodriver.exe");


        driver=new FirefoxDriver();  // Constructor of FirefoxDriver class
    }


}
