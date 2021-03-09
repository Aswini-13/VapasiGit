import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest extends Driver{
    @Test
    public void searchRuby() {
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("aswini13@gmail.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("input[name='commit']")).submit();

        driver.findElement(By.id("keywords")).sendKeys("Ruby");
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector("div[class='panel-body text-center product-body']"));

        for (WebElement e : elements) {
            String text = e.getText();
            System.out.println(text);
            Assert.assertTrue(e.getText().contains("Ruby"));
        }
    }

    @Test
    public void searchApache() {
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("aswini13@gmail.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("input[name='commit']")).submit();

        driver.findElement(By.id("keywords")).sendKeys("Apache");
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector("div[class='panel-body text-center product-body']"));

        for (WebElement e : elements) {
            String text = e.getText();
            System.out.println(text);
            Assert.assertTrue(e.getText().contains("Apache"));
        }
    }
}
