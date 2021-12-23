package SeleniumClass7HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    //https://demoqa.com/nestedframes
    //print the text childframe on console (edited)

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/nestedframes");
        //driver.manage().window().maximize();

     //switch to the desired frame as my desired webelement is inside that frame
        driver.switchTo().frame("frame1");



      WebElement contain =driver.findElement(By.xpath("//*[contains(@srcdoc,'<p>Child Iframe</p>')]"));
        driver.switchTo().frame(contain);

        WebElement child = driver.findElement(By.xpath("//*[text()='Child Iframe']"));
        System.out.println("The text is: " +(child.getText()));

       driver.quit();




}}
