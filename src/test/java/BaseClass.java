import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver driver;

    @BeforeMethod
    public void setUpApp(){
        System.setProperty("webdriver.chrome.driver","C:\\Tools\\driver_chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://nrcmiscmoddev01:8034/#/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Reporter.log("browser session start",true);
    }
    @AfterMethod
    public void closeApp(){
        driver.quit();
        Reporter.log("browser session end",true);
    }
}
