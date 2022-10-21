package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllProductPage extends BasePageParent{
    public AllProductPage(WebDriver driver) {
        super(driver);
    }
    //locators

    By allProductMsg=By.xpath("//h2[@class=\"title text-center\"]");
    By searchProductItem=By.id("search_product");
    By iconSearch=By.id("submit_search");
    By searchTitle=By.cssSelector(".overlay-content > p");

    By firstProduct=By.xpath("(//div[@class=\"productinfo text-center\"])[1]");
    By addToCartFirstBtn=By.xpath("(//a[@data-product-id=\"1\"])[2]");
    By secondProduct=By.xpath("(//div[@class=\"productinfo text-center\"])[2]");
    By addToCartSecondBtn=By.xpath("(//div[@class=\"productinfo text-center\"]/a)[2]");
    By searchProductMsg=By.xpath("//h2[@class=\"title text-center\"]");

    By continueShopping=By.cssSelector(".btn.btn-success");
    By viewCartLink=By.xpath("(//a[@href=\"/view_cart\"])[2]");

    //operators
    public String getAllProductMsg()
    {
        return getTextOfWebelement(allProductMsg);
    }
    public void searchProduct(String productName)
    {
        typeOnInputField(searchProductItem,productName);
        clickElement(iconSearch);
    }
    public void selectTheFirstProduct()
    {
        scrollVertically(700);
        hoverOnElements(firstProduct);
        clickElement(addToCartFirstBtn);
    }
    public AllProductPage clickOnContinueShopping()
    {
        clickElement(continueShopping);
        return new AllProductPage(driver);
    }
    public void selectTheSecondProduct()
    {
        scrollVertically(700);
        hoverOnElements(secondProduct);
        clickElement(addToCartSecondBtn);
    }
    public AddToCartPage ClickOnViewCart()
    {
        clickElement(viewCartLink);
        return new AddToCartPage(driver);
    }
    public String getSearchProductMsg() {
        return getTextOfWebelement(searchProductMsg);
    }

    public String getSearchTitle()
    {
        return getTextOfWebelement(searchTitle);
    }

}
