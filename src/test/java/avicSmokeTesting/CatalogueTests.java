package avicSmokeTesting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CatalogueTests extends BaseTest {

    private String EXPECTED_SEARCH_QUERY_FOR_NOTEBOOKS = "proizvoditel--lenovo";

    @Test(priority = 3)
    public void checkThatCatalogueIsWorking() {

        getMainPage().clickOnProductCatalogButton();
        getMainPage().clickOnNotebooksSwipeButton();

        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY_FOR_NOTEBOOKS));

    }
}
