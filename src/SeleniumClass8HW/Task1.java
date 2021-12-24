package SeleniumClass8HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Task1 {
    //goto http://syntaxprojects.com/window-popup-modal-demo.php
    //click on follow on instagram
    //get the title  of new window and print it on the console

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@title='Follow @syntaxtech on Instagram']")).click();

        Set<String> allHandels=driver.getWindowHandles();

        Iterator<String> it=allHandels.iterator();

        while (it.hasNext()){
            String handler=it.next();
            driver.switchTo().window(handler);

         String title = driver.getTitle();
         if(title.equalsIgnoreCase("https://www.instagram.com/Syntaxtechs/"));
            System.out.println(title);
            break;
        }




}}
