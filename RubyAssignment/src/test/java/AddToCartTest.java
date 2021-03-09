import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends Driver {
    @Test
    public void searchRuby() {
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("aswini13@gmail.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("input[name='commit']")).submit();

        driver.findElement(By.id("keywords")).sendKeys("Ruby on Rails Mug");
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Ruby on Rails Mug')]")).click();

        WebElement element = driver.findElement(By.cssSelector("span[class='lead price selling']"));
        String text = element.getText();
        String textNew = text.replaceAll("\\$","");
        double price = Double.parseDouble(textNew);

        driver.findElement(By.id("add-to-cart-button")).click();
        driver.findElement(By.id("checkout-link")).click();

        WebElement element1 = driver.findElement(By.cssSelector("span[id='summary-order-total']"));
        String text1 = element1.getText();
        String text1New = text1.replaceAll("\\$","");
        double totalPrice = Double.parseDouble(text1New);

        Assert.assertEquals(price ,totalPrice);

    }
}
