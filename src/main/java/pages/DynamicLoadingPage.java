package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpathFormat = ".//a[contains(text(), 'Example 1: Element on page that is hidden')]"; //This contains an error.
    private By link_Example1 = By.xpath(String.format(linkXpathFormat, "Example 1"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1 clickExample1(){
        driver.findElement(By.xpath(linkXpathFormat)).click();
        return new DynamicLoadingExample1(driver);
    }
}
