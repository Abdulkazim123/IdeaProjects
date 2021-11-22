package SyntaxClass21Overriding;

public class Parent {

    void method(int num){
        System.out.println("From parent");
    }


}
class Child extends Parent{
    @Override
    void method(int num) {
        System.out.println("From child");

    }



   /* @Override
     void method(int num){
        System.out.println(num);// canot decrease visibilty
    }*/
        /* @Override
     void method(int num){
        System.out.println(num);// canot decrease visibilty
    }*/
}
 class ParentTester{
    public static void main(String[] args) {
        Child child=new Child();
        child.method(10);
    }

    }

