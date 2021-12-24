package SeleniumClass8HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {

//goto https://chercher.tech/practice/implicit-wait-example
//the checkbox take 10 seconds  to populate
//use implicit wait to check only the first checkbox that populates
// close the browser
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/implicit-wait-example");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);

      WebElement check1= driver.findElement(By.xpath("//*[@type='checkbox'][1]"));
      check1.click();
      driver.close();

}}
