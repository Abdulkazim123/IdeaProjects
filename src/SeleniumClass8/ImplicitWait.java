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

        //declaring a implicit wait for finding elements
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //find the botton to get get new user
      WebElement getNewUser=driver.findElement(By.cssSelector("button#save"));

      //click button
      getNewUser.click();

      //get new user first name
   WebElement Fname = driver.findElement(By.xpath("//div[@id='First-Name']/p"));
        System.out.println(Fname.getText());








    }
}
