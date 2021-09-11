package avic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ElectricScooterPage extends BasePage {

    public ElectricScooterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[@for='fltr-proizvoditel-xiaomi']")
    private WebElement filterButton;

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> listOfElements;

    public void clickOnFilterButton() {
        filterButton.click();
    }

    public List<WebElement> getListOfElements() {
        return listOfElements;
    }
}
