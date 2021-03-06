package com.qa.novotech.tbportal.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver driver;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\driver_chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://nrcmiscmoddev01:8034/#/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void login() {
        driver.findElement(By.id("login-email")).sendKeys("olena@consultnovo.com");
        driver.findElement(By.id("login-password")).sendKeys("Portal@1");
        driver.findElement(By.cssSelector(".auth-box__main-action")).click();
    }

    public void stop() {
        driver.quit();
    }

    public void clickNextButton() {
        driver.findElement(By.xpath("//span[contains(@class,'button btn-sm button--ghost')]")).click();
    }

    public void fillFormProfileStep1() {
        driver.findElement(By.xpath("//div[contains(@class,'admin__index')]/div[1]")).click();
        driver.findElement(By.id("provider-profile")).sendKeys("MedCart");
        driver.findElement(By.xpath("//input[@class='masked-input ember-text-field ember-view']")).sendKeys("1234567890");
        driver.findElement(By.id("email")).sendKeys("medcart@amr.com");
        driver.findElement(By.id("physical-address")).sendKeys("123 W Main St");
        driver.findElement(By.id("city")).sendKeys("Avon Park");
        driver.findElement(By.xpath("(//input[@class='input-with-button__input ember-view'])[1]")).click();
        driver.findElement(By.xpath("//ancestor::div[@class='dropdown dropdown--active']/ul/li[text()='FL']")).click();
        driver.findElement(By.id("county")).sendKeys("Highlands");
        driver.findElement(By.xpath("(//div[@class='col-md-6']//input[@placeholder='Zip code'])[1]")).sendKeys("33825");

        driver.findElement(By.xpath("//div[@class='d-flex justify-content-center my-4']/button[@class='btn-sm']")).click();
        driver.findElement(By.id("mailing-address")).sendKeys("N 23rd St");
        driver.findElement(By.id("mailing-city")).sendKeys("Tampa");
        driver.findElement(By.id("mailing-county")).sendKeys("Hillsborough");
        driver.findElement(By.xpath("(//input[@class='input-with-button__input ember-view'])[2]")).click();
        driver.findElement(By.xpath("//ancestor::div[@class='dropdown dropdown--active']/ul/li[text()='FL']")).click();
        driver.findElement(By.xpath("(//div[@class='col-md-6']//input[@placeholder='Zip code'])[2]")).sendKeys("33701");

        driver.findElement(By.xpath("//div[@class='ember-view']//input[@placeholder='EIN/SSN']")).sendKeys("987543234");
        driver.findElement(By.id("method-of-payment")).click();
        driver.findElement(By.xpath("//ancestor::div[@class='dropdown dropdown--active']/ul/li[text()='Check']")).click();
        driver.findElement(By.id("medicaid-id")).sendKeys("6238476374643");
        driver.findElement(By.id("npi")).sendKeys("2983487236");
    }
}
