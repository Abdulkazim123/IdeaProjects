package SeleniumClass3;

import com.sun.tools.internal.ws.api.TJavaGeneratorExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        WebDriver driver =new ChromeDriver();

        driver.get("http://syntaxprojects.com");
        driver.findElement(By.xpath("//a[contains(@id,'btn_b')]")).click();
        driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("coder");
        driver.findElement(By.xpath("//button[text()=\"Show Message\"]")).click();
        driver.close();


    }
}
