package com.TestCases;

import com.Base.testBase;

public class TestCase001 extends testBase {
    public static void main(String[] args) {
        firefoxLaunch();
        driver.manage().window().maximize();
        openURL("http://apple.com");

        //closeBrowser();
        //driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    }
}
