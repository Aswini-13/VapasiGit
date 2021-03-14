package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(id ="link-to-login")
    WebElement loginLink;
    @FindBy(id ="spree_user_email")
    WebElement userEmail;
    @FindBy(id ="spree_user_password")
    WebElement password;
    @FindBy(name = "commit")
    WebElement loginButton;
    @FindBy(className="alert")
    WebElement titleText;
    @FindBy(xpath = "//a[contains(text(), 'Logout')]")
    WebElement logoutButton;

    public LoginPage(WebDriver driver){
        super(driver);
    }
    public void clickLoginLink(){
        loginLink.click();
    }
    public void setUserEmail(String strUserEmail){

        userEmail.sendKeys(strUserEmail);
    }

    public void setPassword(String strSetPassword){
        password.sendKeys(strSetPassword);
    }
    public void submitToLogin(){
        loginButton.submit();
    }

    public void spreeLogin(String strUserEmail,String strSetPassword){
        this.clickLoginLink();
        this.setUserEmail(strUserEmail);
        this.setPassword(strSetPassword);
        this.submitToLogin();
    }
    public void spreeLogout(){
        logoutButton.click();
    }
    public String getLoginTitle(){
        return    titleText.getText();
    }
}
