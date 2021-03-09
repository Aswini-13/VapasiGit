import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

    public class SelectTest extends Driver{
        @Test
        public void selectBag() {

            driver.findElement(By.xpath("//*[contains(text(),'Bags')]")).click();
            driver.findElement(By.cssSelector("input[value='$15.00 - $18.00']")).click();
            driver.findElement(By.cssSelector("input[class='btn btn-primary']")).click();
            List<WebElement> elements = driver.findElements(By.cssSelector("span[class='price selling lead']"));

            for (WebElement e : elements) {
                String text = e.getText();
                System.out.println(text);
                String textNew = text.replaceAll("\\$","") ;
                double check = Double.parseDouble(textNew);
                if((check >= 15 ) && (check <= 18)){
                    Assert.assertTrue(true);
                }
                else{
                    Assert.assertTrue(false);
                }

            }
        }


    }

