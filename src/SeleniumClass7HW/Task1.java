package SeleniumClass7HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Task1 {
    //goto the Website https://syntaxprojects.com/window-popup-modal-demo.php
    //click on follow on instagram
    //click on facebook.com
    //get all windows handles
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();

        WebElement INS = driver.findElement(By.xpath("//*[@title='Follow @syntaxtech on Instagram']"));
        WebElement FB = driver.findElement(By.xpath("//*[@title='Follow @syntaxtech on Facebook']"));

        INS.click();
        Thread.sleep(2000);
        FB.click();
        Thread.sleep(2000);

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("The number of  Popup windows handles are :"+allWindowHandles.size());

        Iterator<String> it = allWindowHandles.iterator();
       String mainPage=it.next();
        String InsHandlePage = it.next();
        String FbHandlePage = it.next();
        System.out.println("The handle of main page is : " +mainPage);
        System.out.println("The handle of instagram signing page is: " + InsHandlePage);
        System.out.println("The handle of facebook signing page is : " + FbHandlePage);






    }
    }

