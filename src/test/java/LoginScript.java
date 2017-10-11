import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginScript {
  WebDriver driver;

    @BeforeMethod
    public void setUpApp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lena\\IdeaProjects\\TB_Portal\\driver_Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://nrcmiscmoddev01:8034/#/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Reporter.log("browser session start now",true);
    }


    @Test
    public void loginToApp(){
        driver.findElement(By.id("login-email")).sendKeys("olena@consultnovo.com");
        driver.findElement(By.id("login-password")).sendKeys("Portal@1");
        driver.findElement(By.cssSelector(".auth-box__main-action")).click();
    }
    @AfterMethod
    public void closeApp(){
        driver.quit();
    }
}
