package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        /*
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(375,812));
         */


        System.out.println(driver.getTitle());
        //driver.quit();
        //driver.close(); closes the window, not the session.
    }
    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setup();
    }
}


