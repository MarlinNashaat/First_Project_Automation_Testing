package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBarPage extends BasePageParent{

    public NavigationBarPage(WebDriver driver) {
        super(driver);

    }
//locators
    By homeFromNavBar=By.xpath("//a[text()=\" Home\"]");
    By productFromNavBar=By.xpath("//a[text()= \" Products\"]");

    //operators
    public HomePage clickOnHomeNavBar() {
        clickElement(homeFromNavBar);
        return new HomePage(driver);
    }
        public AllProductPage clickOnProductNavBar()
    {
        clickElement(productFromNavBar);
        return new AllProductPage(driver);
    }

}
