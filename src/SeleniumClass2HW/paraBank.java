package SeleniumClass2HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");

        WebDriver driver =new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("kazeem");
        driver.findElement(By.id("customer.lastName")).sendKeys("kazeem");
        driver.findElement(By.id("customer.address.street")).sendKeys("King Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Alexandria");
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("2223006");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("2002456789");
        driver.findElement(By.id("customer.ssn")).sendKeys("00000000000");
        driver.findElement(By.id("customer.username")).sendKeys("JavaJava");
        driver.findElement(By.id("customer.password")).sendKeys("coder@456/java");
        driver.findElement(By.id("repeatedPassword")).sendKeys("coder@456/java");
        //driver.findElement(By.className("button")).click();
       //Thread.sleep(2000);
        //driver.close();





    }
}
