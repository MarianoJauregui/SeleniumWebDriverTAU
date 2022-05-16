package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());

        homePage = new HomePage(driver);

        driver.quit();

        /*
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(375,812));
         */

        //driver.close(); closes the window, not the session.
    }
    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setup();
    }
}


