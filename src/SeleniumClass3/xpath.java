package SeleniumClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("http://www.facebook.com");
       // driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement createNewAcccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAcccount.click();



    }
}
