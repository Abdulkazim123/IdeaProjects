package SeleniumClass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
      WebElement getNewUser=driver.findElement(By.cssSelector("button#save"));
      getNewUser.click();
   WebElement Fname = driver.findElement(By.xpath("//div[@id='First-Name']/p"));
        System.out.println(Fname.getText());








    }
}
