package Admin_Provider_Profile_Setup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.id;

public class Login_Authenticting_User {
    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lena\\IdeaProjects\\TB_Portal\\driver_chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://nrcmiscmoddev01:8034/#/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.id("login-email")).sendKeys("olena@consultnovo.com");
        driver.findElement(id("login-password")).sendKeys("Portal@1");
        driver.findElement(By.cssSelector(".auth-box__main-action")).click();

        driver.findElement(By.xpath("//div[contains(@class,'admin__index')]/div[1]")).click();
        driver.findElement(By.xpath("//span[contains(@class,'button btn-sm')]")).click();

        driver.findElement(By.xpath("//div[contains(@class,'admin__index')]/div[2]")).click();

//        WebElement element = driver.findElement(By.xpath("//div[contains(@class,'admin__index')]/div[2]"));
//        JavascriptExecutor executor =(JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();",element);
//        driver.findElement(By.xpath("//div[@class='dropdown dropdown--active']//li[2]")).click();



    }
}
