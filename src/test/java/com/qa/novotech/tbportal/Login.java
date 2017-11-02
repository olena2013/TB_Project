package com.qa.novotech.tbportal;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login extends BaseClass {


    @Test(description = "Test case perform invalid login")
    public void loginToAppl(){
        app.driver.findElement(By.id("login-email")).sendKeys("alena@consultnovo.com");
        app.driver.findElement(By.id("login-password")).sendKeys("Portal21");
        app.driver.findElement(By.cssSelector(".auth-box__main-action")).click();
        Reporter.log("browser session end",true);
    }


    @Test(description = "Test case perform valid login")
    public void loginToApp(){
        app.login();
    }
}
