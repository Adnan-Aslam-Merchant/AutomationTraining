import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://daraz.pk");
        driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("Xioami");
        driver.findElement(By.xpath("//*[@class=\"search-box__button--1oH7\"]")).click();
        driver.close();

    }
}
