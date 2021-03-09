import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class Driver {
    public WebDriver driver;
    @BeforeMethod
    public void initialSetUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/aswininarasimhan/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void closeApp() {
        //driver.close();
    }
}
