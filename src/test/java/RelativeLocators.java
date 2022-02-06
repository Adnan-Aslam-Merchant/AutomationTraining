import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

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
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        driver.findElement(RelativeLocator.with(By.tagName("input")).below(passwordField)).click();

    }
}
