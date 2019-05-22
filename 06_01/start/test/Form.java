import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Owner/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("David");

        driver.findElement(By.id("last-name")).sendKeys("Cook");

        driver.findElement(By.id("job-title")).sendKeys("Software Tester");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='4']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("05/22/2019");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();


        driver.quit();
    }
}
