package SeleniumClass2HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");

        WebDriver driver =new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("James");
        driver.findElement(By.name("lastname")).sendKeys("coder");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("Jamescoder@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Jamescoder@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Java/coding@$");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_month")).sendKeys("Mar");
        driver.findElement(By.name("birthday_day")).sendKeys("14");
        driver.findElement(By.name("birthday_year")).sendKeys("1988");
       // driver.findElement(By.className("_58mt")).click();
       // driver.findElement(By.xpath("//input[@value='2']")).click();// if the attributes are same with same values
        // then we use this lactor to find our elements
       // driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();//another way that we can get the same
        // atterbutes and values using xpath
        //driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();//we use this solution for same attribute
        // and same valuse to get our elements
        driver.findElement(By.xpath("//input[@value='2']")).click();//Uniqe waty to do it.
        //driver.findElement(By.name("websubmit")).click();
        //Thread.sleep(3000);
       // driver.quit();
       // Thread.sleep(2000);










    }



}
