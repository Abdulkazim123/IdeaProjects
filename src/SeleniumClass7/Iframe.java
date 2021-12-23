package SeleniumClass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        //switch to the desired frame as your desired webelement is inside that frame

        driver.switchTo().frame("frame1");
        //geeting the webelement

       WebElement text1 =driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is: " +text1.getText());


        //as frame 2 doesn't lay inside frame 1 so inorder to get there we need to switch our focus to the deafult page
        driver.switchTo().defaultContent();

       //switch to frame 2
        driver.switchTo().frame("frame2");
        //lacate the webelement
      WebElement text2 =driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is: " +text2.getText());

        // in order to click on webelement "Form'
        //switch the focus back to the deafult
        driver.switchTo().defaultContent();
        // I can simply locate element as it it is not inside frame and perform operartions on it



    }
}
