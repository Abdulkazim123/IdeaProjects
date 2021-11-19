package SyntaxClass19HW;

public class UserClass {
   // Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
   // Print users name, mobile number and address in userDetails method. Test your code

String name;
String  mobilNumber;

    public UserClass( String name, String mobilNumber) {
        this.name = name;
        this.mobilNumber = mobilNumber;
    }


}
class UserInfo extends UserClass {

    String address;

    public UserInfo(String name, String mobilNumber, String address) {
        super(name, mobilNumber);
        this.address = address;
    }

    public void DisplayUserInfo() {
        System.out.println(name + " " + mobilNumber+ " " +address);
    }
}









