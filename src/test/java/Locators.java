import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

    public static String browser = "Chrome";
    public static WebDriver driver;
    public static void main(String[] args) {

        if (browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equals("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.get("https://www.saucedemo.com/");
        //driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
/*
        driver.findElement(By.id("user-name")).sendKeys("standard_user"); //id
        driver.findElement(By.name("user-name").sendKeys("Test"); //name

        driver.findElement(By.className("form_input")).sendKeys("Testing"); //class name
*/
        //driver.findElement(By.linkText("Selenium overview")).click(); //link text
        //driver.findElement(By.partialLinkText("Selenium")).click(); //partial link text
        //driver.findElement(By.cssSelector("#m-documentationoverview")).click(); //css selector
        //driver.findElement(By.tagName("input")).sendKeys("Test"); // tagname

    }
}
