package avic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class MainPage extends BasePage {

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
    private WebElement appleSoreButton;

    @FindBy(xpath = "//a[@href='https://avic.ua/noutbuki-i-aksessuaryi']//span[@class='sidebar-item-title']")
    private WebElement notebookMove1;

    @FindBy(xpath = "//ul[@class='sidebar-list']//a[@href='https://avic.ua/noutbuki']")
    private WebElement notebookMove2;

    @FindBy(xpath = "//ul[@class='sidebar-list']//a[@href='/noutbuki/proizvoditel--lenovo']")
    private WebElement notebookButton;

    @FindBy(xpath = "//a[@href='https://avic.ua/girobordyi-i-giroskuteryi']//span[@class='sidebar-item-title']")
    private WebElement scooterMove1;

    @FindBy(xpath = "//ul[@class='sidebar-list']//a[contains(text(), 'самокат')]")
    private WebElement scooterMove2;

    @FindBy(xpath = "//a[@href='/girobordyi-i-giroskuteryi/vid--elektrosamokat']//img")
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

    public void clickOnElectricScooterSwipeButton() {


        Actions action = new Actions(driver);

        action.moveToElement(scooterMove1).pause(500)
                .moveToElement(scooterMove2).pause(500)
                .moveToElement(scooterButton).pause(500)
                .click().build().perform();
    }


}
