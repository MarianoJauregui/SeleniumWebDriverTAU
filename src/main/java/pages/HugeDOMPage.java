package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HugeDOMPage {
    private WebDriver driver;
    private By table = By.id("large-table");

    public HugeDOMPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToTable(){
        WebElement tableElement = driver.findElement(table);
        String scriptJS = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(scriptJS, tableElement);
    }
}
