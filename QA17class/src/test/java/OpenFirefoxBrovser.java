import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenFirefoxBrovser {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd =new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void testeBaySearch(){
        wd.get("https://www.ebay.com");

        wd.findElement(By.id("gh-ac")).click();
        wd.findElement(By.id("gh-ac")).clear();
        wd.findElement(By.id("gh-ac")).sendKeys("glasses");

        wd.findElement(By.id("gh-ac")).click();
    }
    @AfterClass
    public void tearDown() throws InterruptedException {
       // Thread.sleep(3000);
       // wd.quit();
    }
}
