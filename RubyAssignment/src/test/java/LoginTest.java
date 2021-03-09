
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends Driver{

    @Test
    public void verifyLogin() {
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("aswini13@gmail.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("input[name='commit']")).submit();
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='alert alert-success']")).getText(),
        "Logged in successfully");
    }

    @Test
    public void verifyLogout() {
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("aswini13@gmail.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("input[name='commit']")).submit();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='alert alert-notice']")).getText(),
                "Signed out successfully.");
    }

}
