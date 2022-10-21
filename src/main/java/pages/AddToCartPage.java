package pages;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends BasePageParent{
    public AddToCartPage(WebDriver driver) {
        super(driver);
    }
    //locations

    //view all product in cart
    By allProductOnCart=By.xpath("//tr[contains(@id,'product-')]");

    //first product details
    By priceFirstProduct=By.xpath("(//td[@class=\"cart_price\"])[1]");
    By qualityOfFirstProduct=By.xpath("(//td[@class=\"cart_quantity\"])[1]");
    By totalPriceFirstProduct=By.xpath("(//p[@class=\"cart_total_price\"])[1]");

    //second product details
    By priceSecondProduct=By.xpath("(//td[@class=\"cart_price\"])[2]");
    By qualityOfSecondProduct=By.xpath("(//td[@class=\"cart_quantity\"])[2]");
    By totalPriceSecondProduct=By.xpath("(//p[@class=\"cart_total_price\"])[2]");


    //operators
    //get all product in cart
    public int getAllProductOnCartSize()
    {
        return locateListOfElement(allProductOnCart).size();
    }
    public String getPriceFirstProduct()
    {
        return getTextOfWebelement(priceFirstProduct);
    }
    public String getQualityFirstProduct()
    {
        return getTextOfWebelement(qualityOfFirstProduct);
    }
    public String getTotalPriceFirstProduct()
    {
        return getTextOfWebelement(totalPriceFirstProduct);
    }
    public String getPriceSecondProduct()
    {
        return getTextOfWebelement(priceSecondProduct);
    }
    public String getQualitySecondProduct()
    {
        return getTextOfWebelement(qualityOfSecondProduct);
    }
    public String getTotalPriceSecondProduct()
    {
        return getTextOfWebelement(totalPriceSecondProduct);
    }

}
