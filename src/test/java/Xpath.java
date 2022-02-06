import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Xpath {

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

        driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='Form_submitForm_subdomain']")).sendKeys("hello"); //basic xpath
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Full')]")).sendKeys("Faisal"); //starts-with() xpath
        driver.findElement(By.xpath("//input[contains(@name,'mail')]")).sendKeys("Email"); //contains() xpath
        driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click(); //text() xpath
        driver.findElement(By.xpath("//input[@type='text' and @name='Contact']")).sendKeys("033343425325"); //AND xpath
        driver.findElement(By.xpath("//input[@id='Contact' or @name='Contact']")).sendKeys("024335"); //OR xpath
        driver.findElement(By.xpath("//select[@name='Country']//self::select")).click(); //self xpath
        driver.findElement(By.xpath("//select[@name='Country']//parent::div")).click(); //parent xpath
        driver.findElement(By.xpath("//select[@name='Country']//child::option[3]")).click(); //child xpath
        driver.findElement(By.xpath("//div[@class='container']//descendant::div[@class='collapse navbar-collapse']")).getTagName(); //descendant xpath
        driver.findElement(By.xpath("//div[@class='optanon-status-editable']//ancestor::div[@class='modern']")).getLocation(); //ancestor xpath
        driver.findElement(By.xpath("//option[@value='Algeria']//following::option")).getLocation(); //following xpath
        driver.findElement(By.xpath("//option[@value='France']//following-sibling::option")); //following-sibling xpath
        driver.findElement(By.xpath("//option[@value='France']//preceding::option")); //preceding xpath
        driver.findElement(By.xpath("//option[@value='France']//preceding-sibling::option")).getText(); //preceding-sibling xpath
    }
}
