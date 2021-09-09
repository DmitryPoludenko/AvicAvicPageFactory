package avic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IPhonePage extends BasePage {

    public IPhonePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> amountOfItems;

    @FindBy(xpath = "//label[@for='fltr-1']")
    private WebElement filterButton1;

    @FindBy(xpath = "//label[@for='fltr-seriya-iphone-11']")
    private WebElement filterButton2;


    public void clickOnFilterButton1(){
        filterButton1.click();
    }

    public void clickOnFilterButton2(){
        filterButton2.click();
    }

}
