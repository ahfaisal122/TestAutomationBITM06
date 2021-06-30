package com.WebDriverBasic;

import com.Base.testBase;

public class TitleVerification extends testBase {
    public static void main(String[] args) {
        firefoxLaunch();
        testcase_001();
        testcase_002();
        testcase_003();
        testcase_004();
        closeBrowser();

    }

    public static void testcase_001(){

        //step 1
        openURL("http://apple.com");
        //driver.manage().window().maximize();

        //STEP 2
        String Exp_Title= "APPLE";
        String Act_Title= driver.getTitle();

        //step 3: Compare
        if(Exp_Title.equals(Act_Title)) {
            System.out.println("Title Verified. Test Passed !!");
        }
            else {
                System.out.println("Title not Verified. Test Failed !!") ;
            }

    }

    public static void testcase_002(){

        //step 1
        openURL("http://apple.com");
        //driver.manage().window().maximize();

        //STEP 2
        String Exp_Title= "apple";
        String Act_Title= driver.getTitle();

        //step 3: Compare
        if(Exp_Title.equals(Act_Title)) {
            System.out.println("Title Verified. Test Passed !!");
        }
        else {
            System.out.println("Title not Verified. Test Failed !!") ;
        }

    }

    public static void testcase_003(){

        //step 1
        openURL("http://apple.com");
        //driver.manage().window().maximize();

        //STEP 2
        String Exp_Title= "Apple";
        String Act_Title= driver.getTitle();

        //step 3: Compare
        if(Exp_Title.equals(Act_Title)) {
            System.out.println("Title Verified. Test Passed !!");
        }
        else {
            System.out.println("Title not Verified. Test Failed !!") ;
        }

    }

    //negative test
    public static void testcase_004(){

        //step 1
        openURL("http://apple.com");
        //driver.manage().window().maximize();

        //STEP 2
        String Exp_Title= "apple";
        String Act_Title= driver.getTitle();

        //step 3: Compare
        if(!Exp_Title.equals(Act_Title)) {
            System.out.println("Title Verified. Test Passed !!");
        }
        else {
            System.out.println("Title not Verified. Test Failed !!") ;
        }

    }

}
