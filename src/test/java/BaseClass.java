import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver driver;

    @BeforeTest
    public void setUpApp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lena\\IdeaProjects\\TB_Portal\\driver_Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://nrcmiscmoddev01:8034/#/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

//     @Test
//     public void loginInApp(){
//            driver.findElement(By.id("login-email")).sendKeys("olena@consultnovo.com");
//            driver.findElement(By.id("login-password")).sendKeys("Portal@1");
//            driver.findElement(By.cssSelector(".auth-box__main-action")).click();
//        }



//   @AfterClass
//    public void closeApp(){
//        driver.quit();
//
//   }
//

}