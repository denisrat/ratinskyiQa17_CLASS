import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class wikipedia_login_and_search {
    WebDriver wd;

    @BeforeClass
    public void setUP(){
       wd = new ChromeDriver();
       wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    public void testWikipedia(){
       wd.get("https://ru.wikipedia.org");

        wd.findElement(By.id("pt-login")).click();
        wd.findElement(By.name("wpName")).sendKeys("denis99r");
        wd.findElement(By.id("wpPassword1")).sendKeys("1999dmut");
        wd.findElement(By.id("wpLoginAttempt")).click();
        wd.findElement(By.name("search")).sendKeys("java");
        wd.findElement(By.name("go")).click();

        //wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //wd.findElement(By.id("pt-logout")).click();

    }
    @AfterClass
    public void tearDown() throws InterruptedException {
       // Thread.sleep(3000);
       // wd.quit();
    }
}
