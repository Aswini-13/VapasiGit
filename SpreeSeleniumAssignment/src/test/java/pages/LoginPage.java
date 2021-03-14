package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "link-to-login")
    WebElement loginLink;
    @FindBy(id = "spree_user_email")
    WebElement userEmail;
    @FindBy(id = "spree_user_password")
    WebElement password;
    @FindBy(name = "commit")
    WebElement loginButton;
    @FindBy(className = "alert")
    WebElement titleText;
    @FindBy(xpath = "//a[contains(text(), 'Logout')]")
    WebElement logoutButton;

    @FindBy(id = "keywords")
    WebElement searchText;
    @FindBy(css = "input[value='Search']")
    WebElement searchButton;
    @FindBy(xpath = "//span[contains(text(),'Ruby on Rails Mug')]")
    WebElement productButton;

    @FindBy(css = "span[class='lead price selling']")
    WebElement priceInfo;

    @FindBy(id = "add-to-cart-button")
    WebElement addToCartButton;
    @FindBy(id = "checkout-link")
    WebElement checkoutLink;

    @FindBy(css = "span[id='summary-order-total']")
    WebElement totalPriceInfo;

    @FindBy(css = "a[class='cart-info full']")
    WebElement cart;
    @FindBy(name = "commit")
    WebElement emptyCartButton;

    @FindBy(id = "quantity")
    WebElement quantity;

    @FindBy(className = "delete")
    WebElement remove;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginLink() {
        loginLink.click();
    }

    public void setUserEmail(String strUserEmail) {
        userEmail.sendKeys(strUserEmail);
    }

    public void setPassword(String strSetPassword) {
        password.sendKeys(strSetPassword);
    }

    public void submitToLogin() {
        loginButton.submit();
    }

    public void spreeLogin(String strUserEmail, String strSetPassword) {
        clickLoginLink();
        setUserEmail(strUserEmail);
        setPassword(strSetPassword);
        submitToLogin();
    }

    public void spreeLogout() {
        logoutButton.click();
    }

    public String getTitle() {
        return titleText.getText();
    }

    public void searchProduct(String strProduct) {
        searchText.clear();
        searchText.sendKeys(strProduct);
        searchButton.click();
        productButton.click();

    }

    public double getPrice() {
        String strPrice = priceInfo.getText();
        String price = strPrice.replaceAll("\\$", "");
        return Double.parseDouble(price);
    }

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public void clickCheckoutLink() {
        checkoutLink.click();
    }

    public double getTotalPrice() {
        String strTotalPrice = totalPriceInfo.getText();
        String totalPrice = strTotalPrice.replaceAll("\\$", "");
        return Double.parseDouble(totalPrice);
    }

    public void clickToEmptyCart() {
        cart.click();
        emptyCartButton.click();
    }

    public void addQuantity() {
        quantity.sendKeys(Keys.ARROW_UP);
        quantity.sendKeys(Keys.ARROW_UP);
    }

    public void removeFromCart(){
        remove.click();
    }

}