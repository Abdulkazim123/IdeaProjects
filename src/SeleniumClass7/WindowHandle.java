package SeleniumClass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        //get the address/handle of the page/window
     String signUppageHandle =driver.getWindowHandle();
        System.out.println("the window handle for signing page is :"+signUppageHandle);
        //locate the btns help,Terms,Privacy
       WebElement helpPath=driver.findElement(By.xpath("//a[text()='Help']"));
       WebElement termBtn=driver.findElement(By.xpath("//a[text()='Terms']"));
       WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));

       // click on them to open up new Windows
       helpPath.click();
       termBtn.click();
       privacyBtn.click();
       Set<String> allWindohandles=driver.getWindowHandles();
        System.out.println("number of window handle is:"+allWindohandles.size());

        //inorder to print all window handles we need to iterate over the SET
        Iterator<String> it=allWindohandles.iterator();
        signUppageHandle=it.next();
        String helpPageHandle=it.next();
        String termPageHandle=it.next();
        String privacyPageHandle=it.next();

        System.out.println("the handle for signup page is : "+signUppageHandle);
        System.out.println("the handle for signup page is : "+helpPageHandle);
        System.out.println("the handle for signup page is : "+termPageHandle);
        System.out.println("the handle for signup page is : "+privacyPageHandle);

         //swtich to help page page
        //driver.switchTo().window(privacyPageHandle);
       // System.out.println(driver.getTitle());




    }
}
