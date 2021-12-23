package SeleniumClass4HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    //Enter valid username
    //enter wrong password
    //Click on login button
    //Verify error message with text “Invalid Credenitals” is displayed.
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
       WebElement userName= driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input"));
       userName.sendKeys("Admin");
       WebElement passWord=driver.findElement(By.xpath("//div[@id='divPassword']/input"));
       passWord.sendKeys("123456");
       driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
       WebElement spanMessage=driver.findElement(By.xpath("//span[starts-with(@id,'spanMessage')]"));
        System.out.println(spanMessage.getText());


    }
}
