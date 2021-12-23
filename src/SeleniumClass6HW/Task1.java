package SeleniumClass6HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    //handle all alerts one by one
    //1.simple
    //2.confirmaton
    //3.prompt
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        Thread.sleep(2000);
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Alert confirmationAlert=driver.switchTo().alert();
        System.out.println(confirmationAlert.getText());
        confirmationAlert.dismiss();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        Thread.sleep(2000);
         Alert promptAlert=driver.switchTo().alert();
         promptAlert.sendKeys("Moazzam teaches us Selenium");
         promptAlert.accept();






    }

}
