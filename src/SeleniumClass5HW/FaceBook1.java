package SeleniumClass5HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Boy");
        driver.findElement(By.name("lastname")).sendKeys("Lovely");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("Boylovely@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Boylovely@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Sky123/blue");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_month")).sendKeys("Jan");
        driver.findElement(By.name("birthday_day")).sendKeys("10");
        driver.findElement(By.name("birthday_year")).sendKeys("1990");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("websubmit")).click();

         //driver.quit();


    }
}
