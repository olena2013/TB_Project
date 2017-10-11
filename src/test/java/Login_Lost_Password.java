import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login_Lost_Password {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lena\\IdeaProjects\\TB_Portal\\driver_Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://nrcmiscmoddev01:8034/#/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@class='form-group mb-0 pt-3']//h6[text()='Forgot your password?']")).click();
        driver.findElement(By.id("user-first")).sendKeys("Olena");
        driver.findElement(By.id("user-last")).sendKeys("Tunyk");
        driver.findElement(By.id("user-email")).sendKeys("olena@consultnovo.com");
        driver.findElement(By.xpath("//div[@class='form-group pt-3']/button[text()='Request Password']")).click();
    }
}
