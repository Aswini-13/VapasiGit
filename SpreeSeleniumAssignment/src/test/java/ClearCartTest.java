import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class ClearCartTest extends BaseTest {
    @Test
    public void addAndRemoveProduct() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.spreeLogin("aswini13@gmail.com","12345678");
        loginPage.searchProduct("Ruby on Rails Mug");
        loginPage.addQuantity();
        loginPage.clickAddToCart();
        loginPage.removeFromCart();
        Assert.assertEquals(loginPage.getTitle(),
                "Your cart is empty");
    }
}


