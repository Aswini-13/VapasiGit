import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClearCartTest extends Driver{
   @Test
    public void searchRuby() {
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("aswini13@gmail.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("input[name='commit']")).submit();

        driver.findElement(By.id("keywords")).sendKeys("Ruby on Rails Mug");
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Ruby on Rails Mug')]")).click();

        WebElement addElement = driver.findElement(By.id("quantity"));
        addElement.sendKeys(Keys.ARROW_UP);
        addElement.sendKeys(Keys.ARROW_UP);
        driver.findElement(By.id("add-to-cart-button")).click();;

        driver.findElement(By.className("delete")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='alert alert-info']")).getText(),
               "Your cart is empty");
   }
}