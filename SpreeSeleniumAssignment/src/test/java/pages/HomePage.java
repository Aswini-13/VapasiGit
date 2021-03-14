package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(id = "keywords")
    WebElement searchText;
    @FindBy(css = "input[value='Search']")
    WebElement searchButton;
    @FindBys(@FindBy(css = "div[class='panel-body text-center product-body']"))
    List<WebElement> products;

    @FindBy(id = "taxonomies")
    WebElement taxonomy;
    @FindBy(css = ".filter-title +.list-group")
    WebElement filterPrice;
    @FindBy(css = "input[class='btn btn-primary']")
    WebElement filterButton;
    @FindBys(@FindBy(css = "span[class='price selling lead']"))
    List<WebElement> filteredProducts;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct(String strProduct) {
        searchText.clear();
        searchText.sendKeys(strProduct);
        searchButton.click();
    }

    public boolean areProductsDisplayedMatchingSearchText(String strProduct) {
        for (WebElement e : products) {
            String text = e.getText();
            System.out.println("search text:" + text);
            if (!(text.contains(strProduct))) {
                return false;
            }
        }
        return true;
    }

    public void selectProduct(String strProduct) {
        driver.findElement(By.xpath("//*[contains(text(),'Bags')]")).click();
    }

    public void filterByPrice(String strRange) {
        String searchString = "input[value='"+strRange+"']";
        System.out.println(searchString);
        filterPrice.findElement(By.cssSelector(searchString)).click();
        filterButton.click();
    }


    public boolean areSelectedProductsMatchingPriceRange(double min, double max) {
        for (WebElement e : filteredProducts) {
            String text = e.getText();
            System.out.println(text);
            String textNew = text.replaceAll("\\$", "");
            double check = Double.parseDouble(textNew);
            if (!((check >= min) && (check <= max))) {
                return false;
            }
        }
        return true;
    }
}
