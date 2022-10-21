package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NavigationBarPage;

public class HomeTest extends BaseTestParent{


    @Test
    public void testHomePageIsVisible() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);

        //click on Home page and get msg welcome
        HomePage homePage = navigationBarPage.clickOnHomeNavBar();
        Assert.assertEquals(homePage.getfeaturesItemsMsg(), "FEATURES ITEMS");

    }
}
