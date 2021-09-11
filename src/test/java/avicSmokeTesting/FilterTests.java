package avicSmokeTesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FilterTests extends BaseTest {

    private String EXPECTED_SEARCH_QUERY_FILTER1 = "available--on";

    private String EXPECTED_SEARCH_QUERY_FILTER2 = "available--on_seriya--iphone-11";

    @Test(priority = 5)
    public void checkCorrectlyWorkingFilter() {

        getMainPage().clickOnProductCatalogButton();
        getMainPage().clickOnAppleStoreButton();
        getAppleStorePage().clickIphoneButton();
        getIphonePage().waitForPageLoadComplete(30);
        getIphonePage().clickOnFilterButton1();
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY_FILTER1));

        getIphonePage().clickOnFilterButton2();
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY_FILTER2));


    }


}
