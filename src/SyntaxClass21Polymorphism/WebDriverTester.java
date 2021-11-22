package SyntaxClass21Polymorphism;

public class WebDriverTester {
    public static void main(String[] args) {
        //if we want to print indiviual class thaen we use this method with objects details
        // Ex;
  /*GoogleChrome googleChrome=new GoogleChrome();
  FireFox fireFox=new FireFox();
  Safari safari=new Safari();
*/
        WebDriver webDriver = new GoogleChrome();// we use this method  to print all details of all objects instead
        // of writting all the objects so we use Polymorphism to do shuch as action on short way.
       /* WebDriver webDriver1=new Safari();
        webDriver.openWebsites();
        webDriver.signup();
        webDriver.login();
        webDriver.enterUserpasssword();
        webDriver.clickSubmit();
        */webDriver.closeBrowser();



        WebDriver[] webDrivers = {new GoogleChrome(), new FireFox(), new Safari()};// we use this way for executing all
        // the classes objects one by one instead of writting all details it is called Polymorphism.
        for (WebDriver wb : webDrivers) {

            wb.openWebsites();
            wb.signup();
            wb.login();
            wb.enterUserpasssword();
            wb.clickSubmit();
            wb.closeBrowser();


        }

    }
    }





