package com.AmazonShopping.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private Driver(){}
    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null){
            String browser=ConfigurationReader.get("browser");

            switch (browser){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;

            }

        }
        return driver;

    }


    public static void destroyer(){
        if (driver!=null){
            driver.close();
            driver=null;
        }
    }
}
