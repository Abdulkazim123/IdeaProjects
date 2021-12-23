package SeleniumClass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandale {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        WebElement newTab =driver.findElement(By.cssSelector("button#tabButton"));
       WebElement newWindow=driver.findElement(By.cssSelector("button#windowButton"));

       newWindow.click();
       newTab.click();
    String  parentHandle= driver.getWindowHandle();
        System.out.println("The parent handle is:"+parentHandle);

        Set<String> allHandles= driver.getWindowHandles();

        Iterator<String> it=allHandles.iterator();

        while (it.hasNext()){
            String handler= it.next();
            driver.switchTo().window(handler);
            if(driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")){
                System.out.println(driver.getCurrentUrl());
                break;

            }

        }
      WebElement text  = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());

        driver.switchTo().window(parentHandle);
        driver.findElement(By.cssSelector("button#messageWindowButton")).click();
        driver.quit();





    }
}
