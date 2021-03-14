import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class AddToCartTest extends BaseTest {
    @Test
    public void addCartAndValidateAmount() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.spreeLogin("aswini13@gmail.com","12345678");
        loginPage.searchProduct("Ruby on Rails Mug");
        double productPrice = loginPage.getPrice();
        loginPage.clickAddToCart();
        loginPage.clickCheckoutLink();
        double totalPrice = loginPage.getTotalPrice();
        Assert.assertEquals(productPrice ,totalPrice,"Mismatch in price");

    }
}

