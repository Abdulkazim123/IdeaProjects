package SeleniumClass4HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    //goto:http://syntaxprojects.com/input-form-demo.php
    //fill in all the textboxes in the form.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Selenium");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("AdvancXpath");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Seleniumadvancexpath@gamil.com");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("(000)000-0000");
        driver.findElement(By.cssSelector("input[name='address']")).sendKeys("12345 virginia ave");
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Alexandria");
        driver.findElement(By.cssSelector("select[name='state']")).sendKeys("Virginia");
        driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("10334");
        driver.findElement(By.cssSelector("input[name='website']")).sendKeys("www.selenium.com");
        driver.findElement(By.cssSelector("input[value='yes']")).click();
        driver.findElement(By.cssSelector("textarea[name='comment']")).sendKeys("Object Oriented programing.");




    }
}
