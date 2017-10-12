import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseClass {


    @Test(description = "Test case perform invalid login")
    public void loginToAppl(){
        driver.findElement(By.id("login-email")).sendKeys("alena@consultnovo.com");
        driver.findElement(By.id("login-password")).sendKeys("Portal21");
        driver.findElement(By.cssSelector(".auth-box__main-action")).click();
        Reporter.log("browser session end",true);
    }


    @Test(description = "Test case perform valid login")
    public void loginToApp(){
        driver.findElement(By.id("login-email")).sendKeys("olena@consultnovo.com");
        driver.findElement(By.id("login-password")).sendKeys("Portal@1");
        driver.findElement(By.cssSelector(".auth-box__main-action")).click();
    }
}
