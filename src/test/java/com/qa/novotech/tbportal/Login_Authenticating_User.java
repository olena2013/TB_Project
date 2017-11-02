package com.qa.novotech.tbportal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;


public class Login_Authenticating_User {
    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lena\\IdeaProjects\\TB_Portal\\driver_Firefox\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lena\\IdeaProjects\\TB_Portal\\driver_Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://nrcmiscmoddev01:8038/#/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.id("login-email")).sendKeys("olena@consultnovo.com");
        driver.findElement(By.id("login-password")).sendKeys("Portal21");

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertTrue(!(driver.findElement(By.cssSelector(".auth-box__main-action")).isEnabled()));
//

//
        driver.findElement(By.id("login-email")).clear();
        driver.findElement(By.id("login-email")).sendKeys("olena@consultnovo.com");

        driver.findElement(By.id("login-password")).clear();
        driver.findElement(By.id("login-password")).sendKeys("Portal@1");

        driver.findElement(By.cssSelector(".auth-box__main-action")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(@class,'admin__index')]/div[1]")).click();


        driver.findElement(By.cssSelector(".auth-box__main-action")).click();


    }


}








