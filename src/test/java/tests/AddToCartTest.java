package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.AllProductPage;
import pages.NavigationBarPage;

public class AddToCartTest extends BaseTestParent{

    @Test
    public void testAddToCart()
    {
        NavigationBarPage navigationBarPage=new NavigationBarPage(driver);
        AllProductPage allProductPage=navigationBarPage.clickOnProductNavBar();

        //hover firstProduct and add to cart Then ClickOnContinueShopping
        Assert.assertEquals(allProductPage.getSearchProductMsg(),"ALL PRODUCTS");
        allProductPage.selectTheFirstProduct();
        allProductPage.clickOnContinueShopping();


        //hover SecondProduct and viewCart
        allProductPage.selectTheSecondProduct();
        AddToCartPage addToCartPage=allProductPage.ClickOnViewCart();

        //view allProductOfCart
        Assert.assertEquals(addToCartPage.getAllProductOnCartSize(),2);

        //check for Price,Quality and Total of FristProduct
        Assert.assertEquals(addToCartPage.getPriceFirstProduct(),"Rs. 500");
        Assert.assertEquals(addToCartPage.getQualityFirstProduct(),"1");
        Assert.assertEquals(addToCartPage.getTotalPriceFirstProduct(),"Rs. 500");

        //check for Price,Quality and Total of SecondProduct
        Assert.assertEquals(addToCartPage.getPriceSecondProduct(),"Rs. 400");
        Assert.assertEquals(addToCartPage.getQualitySecondProduct(),"1");
        Assert.assertEquals(addToCartPage.getTotalPriceSecondProduct(),"Rs. 400");

     }
}
