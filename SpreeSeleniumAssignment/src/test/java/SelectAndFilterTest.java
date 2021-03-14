import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SelectAndFilterTest extends BaseTest {
    @Test
    public void selectAndFilterProducts( ) {
        HomePage homePage = new HomePage(driver);
        homePage.selectProduct("Bags");
        homePage.filterByPrice("$15.00 - $18.00");
        Assert.assertTrue(homePage.areSelectedProductsMatchingPriceRange(15,18));
    }
}
