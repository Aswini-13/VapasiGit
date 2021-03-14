import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchTest extends BaseTest {

    @DataProvider(name = "searchKey")
    public Object[][] searchKeyData(){
        return new Object[][]{{"Ruby"}, {"Apache"}};
    }

    @Test(dataProvider = "searchKey")
    public void searchProducts(String key) {
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct(key);
        Assert.assertTrue(homePage.areProductsDisplayedMatchingSearchText(key));
    }

}