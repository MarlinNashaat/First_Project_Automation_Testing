package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.HomePage;
import pages.NavigationBarPage;
import pages.AllProductPage;

public class AllProductTest extends BaseTestParent{


    @Test
    public void testSearchProductContainKeyword()
    {
        NavigationBarPage navigationBarPage=new NavigationBarPage(driver);

        //click on product page and get msg welcome
        AllProductPage allProductPage=navigationBarPage.clickOnProductNavBar();
        Assert.assertEquals(allProductPage.getAllProductMsg(),"ALL PRODUCTS");


        //Enter ProductName and click on search then check for msg
         allProductPage.searchProduct("blue");
         Assert.assertEquals(allProductPage.getSearchProductMsg(),"SEARCHED PRODUCTS");
    }
}
