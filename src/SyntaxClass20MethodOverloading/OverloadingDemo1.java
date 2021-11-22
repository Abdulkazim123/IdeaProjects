package SyntaxClass20MethodOverloading;

public class OverloadingDemo1 {

    void method(int number) {
        System.out.println(number);

    }

    void method(String name) {
        System.out.println(name);
        System.out.println("Hello");
        System.out.println("java");
    }
    void method(String name, int num){
        System.out.println(name);
        System.out.println("Hello");
        System.out.println("Java");
    }

    public static void main(String[] args) {
        OverloadingDemo1 overloadingDemo1=new OverloadingDemo1();
        overloadingDemo1.method(10);
        overloadingDemo1.method("kazim");
        overloadingDemo1.method("kazim",10);

    }

}
