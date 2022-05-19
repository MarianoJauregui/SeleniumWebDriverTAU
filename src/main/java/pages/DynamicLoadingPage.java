package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpathFormat = ".//a[contains(text(), '%s')"; //This contains an error.
    private By link_Example1 = By.xpath(String.format(linkXpathFormat, "Example 1"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1 clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1(driver);
    }
}
