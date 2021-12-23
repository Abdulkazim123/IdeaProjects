package SeleniumClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpatUsingtext {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("http://syntaxprojects.com");
       WebElement alertLink= driver.findElement(By.xpath("//a[text()='Alerts & Modals']"));
        alertLink.click();

       // driver.manage().window().maximize();

    }
}
