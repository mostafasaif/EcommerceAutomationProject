package org.example.stepDefin;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver=null;

    @Before
    public static void  openBrowser()
    {  //1- Bridges
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\chromedriver.exe");

        //2- creat new object of driver from chrome driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //4- navigate to web site
        driver.navigate().to("https://demo.nopcommerce.com/");



    }
    @After

    public static void closeDriver() throws InterruptedException
    {
        Thread.sleep(5000);
        driver.quit();


    }
}
