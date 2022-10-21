package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePageParent{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //locator
    By featuresItemsMsg=By.xpath("(//div/h2[@class=\"title text-center\"])[1]");

    //operators

    public String getfeaturesItemsMsg()
    {

        return getTextOfWebelement(featuresItemsMsg);
    }
}
