import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Openchrom {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
    wd= new ChromeDriver();
}

    @Test
    public void chromTest() {
        wd.get("http:/google.com");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        wd.quit();
    }
}