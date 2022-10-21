package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePageParent {
    WebDriver driver;
    WebDriverWait wait;
    public BasePageParent(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    public WebElement locateElement(By elementLocator)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
        wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
        return driver.findElement(elementLocator);
    }
    public List<WebElement> locateListOfElement (By elementsLocator)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementsLocator));
        wait.until(ExpectedConditions.elementToBeClickable(elementsLocator));
        return driver.findElements(elementsLocator);
    }
    public void clickElement(By elementLocator)
    {
        locateElement(elementLocator).click();
    }
    public void typeOnInputField(By elementLocator,String text)
    {
        locateElement(elementLocator).sendKeys(text);
    }

    public String getTextOfWebelement(By elementLocator)
    {

        return locateElement(elementLocator).getText();
    }

    public void scrollVertically (int deltaY)
    {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, deltaY).perform();

    }
    public void hoverOnElements(By elementLocator)
    {
        Actions actions=new Actions(driver);
        actions.moveToElement(locateElement(elementLocator));
        actions.perform();
    }
   /*public boolean checkOnSearchResults(String searchedKeyWord)
    {

        List<WebElement> productsTitles = locateListOfElement(searchTitle);
        int numberOfSearchedItems = productsTitles.size();

        for (int i = 0; i < numberOfSearchedItems; i++) {
            String searchedProductName = productsTitles.get(i).getText();
            if (searchedProductName.contains(searchedKeyWord)) {
                return true;
                //break;
            }
        }
        return false;
    }*/


}
