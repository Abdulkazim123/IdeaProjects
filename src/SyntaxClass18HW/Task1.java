package SyntaxClass18HW;

public class Task1 {

    public static void main(String[] args) {
        C b=new C();
    }
}

class A{
    public A() {
        System.out.println("A");
    }
    }
    class B extends A{
        public B() {
            System.out.println("B");
        }
        }
        class C extends B{
            public C(){
                System.out.println("C");
            }
        }

