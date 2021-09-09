package avic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppleStorePage extends BasePage {

    public AppleStorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='brand-box__info']//a[@href='https://avic.ua/iphone']")
    private WebElement iPhoneButton;

    public void clickIphoneButton(){
        iPhoneButton.click();
    }
}
