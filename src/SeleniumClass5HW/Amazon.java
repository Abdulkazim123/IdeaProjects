package SeleniumClass5HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Amazon {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The size of all list links are:" + links.size());

        for (WebElement link : links) {

            String linkText = link.getText();

            //here by using this method we ignore those links which don't have Text we only print links contains texts
            if (!linkText.isEmpty()) {
                System.out.println(linkText);
            }


        }
    }
}



