package SyntaxClass21Polymorphism;

public class WebDriver {
    void openWebsites(){
        System.out.println("Opening a websites ");
    }
    void signup(){

        System.out.println("Sign on the website");
    }
    void login(){

        System.out.println("Login to website");
    }
    void enterUserpasssword(){

        System.out.println("Entering the user password");
    }
    void clickSubmit(){

        System.out.println("clicking on the submit botton");
    }
    void closeBrowser(){
        System.out.println("closing the browser");

    }
}
class GoogleChrome extends WebDriver{
    void openWebsites(){

        System.out.println("Opening a websites in Google Chrome");
    }
    void signup(){

        System.out.println("Sign on the website in Google Chrome");
    }
    void login(){

        System.out.println("Login to website in Google Chrome");
    }
    void enterUserpasssword(){

        System.out.println("Entering the user password in Google Chrome");
    }
    void clickSubmit(){

        System.out.println("clicking on the submit botton in Google Chrome");
    }
    void closeBrowser(){
        System.out.println("closing browser in Google Chrome");

    }
}
class FireFox extends WebDriver{
    void openWebsites(){
        System.out.println("Opening a websites in FireFox" );
    }
    void signup(){

        System.out.println("Sign on the website FireFox");
    }
    void login(){

        System.out.println("Login to website in FireFox");
    }
    void enterUserpasssword(){
        System.out.println("Entering the user password in FireFox");
    }
    void clickSubmit(){

        System.out.println("clicking on the submit botton in FireFox");
    }
    void closeBrowser(){
        System.out.println("closing the browser in FireFox");

    }

}
class Safari extends WebDriver{
    void openWebsites(){
        System.out.println("Opening a websites in Safari");
    }
    void signup(){

        System.out.println("Sign on the website Safari");
    }
    void login(){

        System.out.println("Login to website in Safari");
    }
    void enterUserpasssword(){
        System.out.println("Entering the user password in Safari");
    }
    void clickSubmit(){

        System.out.println("clicking on the submit botton in Safari");
    }
    void closeBrowser(){
        System.out.println("closing the browser in Safari");


    }

}