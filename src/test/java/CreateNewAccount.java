import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateNewAccount {
    private WebDriver driver;

    @BeforeTest
    public void start() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lena\\IdeaProjects\\TB_Portal\\driver_chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://nrcmiscmoddev01:8034");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("login-email")).sendKeys("olena@consultnovo.com");
        driver.findElement(By.id("login-password")).sendKeys("Portal@1");
        driver.findElement(By.cssSelector(".auth-box__main-action")).click();
    }

    @Test
    public void createNewAccount() {
        driver.findElement(By.xpath("//div[contains(@class,'flex-wrapper justify-content')]/div[1]")).click();
        driver.findElement(By.id("provider-profile")).sendKeys("MedCard");
        driver.findElement(By.xpath("(//input[contains(@class,'ember-text-field ember-view')])[1]")).sendKeys("1236647897");
        driver.findElement(By.id("email")).sendKeys("medcard@gmail.com");
        driver.findElement(By.id("physical-address")).sendKeys("123 Main St");
        driver.findElement(By.id("city")).sendKeys("Safety Harbor");
        driver.findElement(By.cssSelector("input[placeholder=State]")).click();
        driver.findElement(By.xpath("//div[@class='dropdown dropdown--active']//li[text()='FL']")).click();
        driver.findElement(By.id("county")).sendKeys("Pinellas");
        driver.findElement(By.cssSelector("input[placeholder='Zip code']")).sendKeys("34695");

        driver.findElement(By.cssSelector(".btn-sm")).click();
        driver.findElement(By.id("mailing-address")).sendKeys("234 N Main St");
        driver.findElement(By.cssSelector("#mailing-city")).sendKeys("Bushnell");
        driver.findElement(By.id("mailing-county")).sendKeys("Sumter");
        driver.findElement(By.xpath("(//div[@class='col-md-6']//input[@class='input-with-button__input ember-view'])[2]")).click();
        driver.findElement(By.xpath("//div[@class='dropdown dropdown--active']//li[text()='FL']")).click();
        driver.findElement(By.xpath(("(//div[@ class='col-md-6']//input[@placeholder='Zip code'])[2]"))).sendKeys("32224");

        driver.findElement(By.xpath("//input[@placeholder='EIN/SSN']")).sendKeys("364823746");
        driver.findElement(By.id("medicaid-id")).sendKeys("2983218985648");
        driver.findElement(By.xpath("//input[@ placeholder='Method of payment']")).click();
        driver.findElement(By.xpath("//div[@class='dropdown dropdown--active']//li[text()='Check']")).click();
        driver.findElement(By.id("npi")).sendKeys("4958263678");

        driver.findElement(By.id("amr-comm-center")).sendKeys("AMR Center phone( 209)-237-8837");
        driver.findElement(By.xpath("//footer[@class='footer-registration page-wrapper']//span[text()='NEXT - Service Area']")).click();
        //   }

//    @Test
//    public void createNewAccount_step2() {
        driver.findElement(By.xpath("//div[@class='pick-list']//input[@class='input-with-button__input ember-view']")).click();
//
//        driver.findElement(By.xpath("//div[@class='dropdown dropdown--active']//li[text()='FL']")).click();
    }


    @AfterTest
    public void stop() {
        driver.quit();
    }


}