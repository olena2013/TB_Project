import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Administrator_Registration_Setup {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lena\\IdeaProjects\\TB_Portal\\driver_Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://nrcmiscmoddev01:8034#/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();


        driver.findElement(By.id("login-email")).sendKeys("olena@consultnovo.com");
        driver.findElement(By.id("login-password")).sendKeys("Portal@1");
        driver.findElement(By.cssSelector(".auth-box__main-action")).click();

        driver.findElement(By.xpath("//div[contains(@class,'admin__index')]/div[2]")).click();
//      for (String winHandle:driver.getWindowHandles()){
//            driver.switchTo().window(winHandle);
//   }
        WebElement element = driver.findElement(By.xpath("//input[contains(@class,'input ember-view')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

        //driver.findElement(By.xpath("//input[contains(@class,'input ember-view')]")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@class='dropdown dropdown--active']//li[2]")).click();
        driver.findElement(By.xpath("//button[text()='GO']")).click();

        driver.findElement(By.xpath("//span[contains(@class,'ghost footer-registration')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[contains(@class,'admin__index')]/div[3]")).click();
//        WebElement element1 = driver.findElement(By.xpath("//input[contains(@class,'input ember-view')]"));
//        executor.executeScript("arguments[0].click();", element1);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='dropdown dropdown--active']//li[2]")).click();
        driver.findElement(By.xpath("//button[text()='GO']")).click();


//        WebElement we = driver.findElement(By.xpath("//header[contains(@class,'header header--admin')]//h2[1]"));
//        Actions action = new Actions(driver);
//        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//header[contains(@class,'header header--admin')]//h2[1]"))).click().build().perform();

//        WebElement link = driver.findElement(By.xpath("(//a[contains(@href,'admin')])[1]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(link).moveToElement(driver.findElement(By.xpath("(//a[contains(@href,'admin')])[1]"))).click().build().perform();

//        driver.findElement(By.xpath("//header[contains(@class,'header header--admin')]//h2[1]")).click();
//        driver.findElement(By.xpath("(//a[contains(@href,'admin')])[1]")).click();


//
//        driver.findElement(By.xpath("//div[@class='dropdown dropdown--cover']/ul/li[2]")).click();
//        //driver.findElement(By.xpath("//span[contains(@class,'button btn-sm button')]")).click();

    }

}


