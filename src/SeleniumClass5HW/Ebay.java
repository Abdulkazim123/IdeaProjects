package SeleniumClass5HW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay {
//Go to ebay.com
//get all the categories and print them in the console
//select Computers/Tables & Networking
//click on search
//verify the title of page
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        WebElement catgor =driver.findElement(By.cssSelector("select#gh-cat"));

        catgor.click();
        System.out.println(catgor.getText());

        Select select=new Select(catgor);
        select.selectByIndex(11);
        Thread.sleep(2000);
     WebElement verify = driver.findElement(By.xpath("//input[@value='Search']"));
     verify.click();
      WebElement verify1  =driver.findElement(By.cssSelector("span.b-pageheader__text"));
         verify1.click();
         Thread.sleep(2000);
        System.out.println("The Tilte of this catagory is: "+driver.getTitle());















    }
}
