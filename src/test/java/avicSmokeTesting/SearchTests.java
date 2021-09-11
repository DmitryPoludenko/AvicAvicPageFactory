package avicSmokeTesting;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {

    private String SEARCH_KEYWORD_FOR_IPHONE = "iPhone 11";
    private String SEARCH_KEYWORD_FOR_SCOOTER = "Mi";



    private String EXPECTED_SEARCH_QUERY_FOR_IPHONES = "query=iPhone+11";

    @Test(priority = 1)
    public void checkThatUrlContainsSearchWord() {
        getMainPage().searchByKeyword(SEARCH_KEYWORD_FOR_IPHONE);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY_FOR_IPHONES));
    }

    @Test(priority = 2)
    public void checkElementsAmountOnSearchPage() {
        getMainPage().searchByKeyword(SEARCH_KEYWORD_FOR_IPHONE);
        getMainPage().implicitWait(30);
        assertEquals(getSearchResultsPage().getSearchResultsCount(), 12);
    }

    @Test(priority = 4)
    public void checkIfSearchResultByFilterContainsSearchWord() {

        getMainPage().clickOnElectricScooterButton();
        getMainPage().implicitWait(30);
        getElectricScooterPage().clickOnFilterButton();

        for (WebElement webElement : getElectricScooterPage().getListOfElements()) {
            assertTrue(webElement.getText().contains(SEARCH_KEYWORD_FOR_SCOOTER));
        }
    }

}
