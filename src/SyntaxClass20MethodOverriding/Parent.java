package SyntaxClass20MethodOverriding;

public class Parent {

    String name="sedat";
    void printName(){
        System.out.println("name is"+name);

    }
    void getMarried(){
        System.out.println("Ahmet will get married by my choice ");
    }
}
class Child extends Parent {
    String name="Ahmet";
    void prinName(){
         String name="sharif";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
   @Override
    void getMarried(){
        System.out.println("But I like somone else");
    }
    void letsDoSomethingCrazzy(){
        super.getMarried();
        getMarried();
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.letsDoSomethingCrazzy();
    }
}
