package avic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
    private WebElement appleSoreButton;

    @FindBy(xpath = "//img[@data-src='https://avic.ua/assets/cache/menus/1/3-882649283818-menu_md.png']")
    private WebElement notebookMove1;

    @FindBy(xpath = "//ul[@class='sidebar-list']//a[contains(text(), 'Ноут')]")
    private WebElement notebookMove2;

    @FindBy(xpath = "//ul[@class='sidebar-list']//a[@href='/noutbuki/proizvoditel--lenovo']")
    private WebElement notebookButton;

    @FindBy(xpath = "//img[@data-src='https://avic.ua/assets/cache/menus/1/12-82649283827-menu_md.png']")
    private WebElement scooterButton;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword);
        searchButton.click();
    }

    public void clickOnProductCatalogButton() {
        productCatalogButton.click();
    }

    public void clickOnAppleStoreButton() {
        appleSoreButton.click();
    }

    public void clickOnNotebooksSwipeButton() {
        Actions action = new Actions(driver);
        action.moveToElement(notebookMove1).pause(500)
                .moveToElement(notebookMove2).pause(500)
                .moveToElement(notebookButton).click().build().perform();
    }

    public void clickOnElectricScooterButton() {
        scooterButton.click();
    }

}
