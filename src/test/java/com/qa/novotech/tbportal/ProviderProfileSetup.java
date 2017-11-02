package com.qa.novotech.tbportal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class ProviderProfileSetup extends BaseClass {

    public WebDriver driver;
    @Test
    public void testProviderProfileSetup() {
        app.fillFormProfileStep1();
        app.clickNextButton();

     driver.findElement(By.xpath("//input[@class='input-with-button__input ember-view']")).click();
     driver.findElement(By.xpath("//div[@class='input-with-button__wrapper ember-view']//li[text()='FL']")).click();


    }


}


