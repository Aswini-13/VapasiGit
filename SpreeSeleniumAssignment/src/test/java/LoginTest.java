import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.spreeLogin("aswini13@gmail.com","12345678");
        Assert.assertEquals(loginPage.getTitle(),
                "Logged in successfully","Incorrect Login");
    }

    @Test
    public void verifyLogout() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.spreeLogin("aswini13@gmail.com","12345678");
        loginPage.spreeLogout();
        Assert.assertEquals(loginPage.getTitle(),
                "Signed out successfully.","Incorrect Logout");
    }
}