package SyntaxClass21Polymorphism;

public class Car {

    void start(){

        System.out.println("Use keys to start me");
    }
    void stop(){

        System.out.println("use brake to stop me");
    }
    void park(){

        System.out.println("park me manualy");
    }
}
class BMW extends Car{
    @Override
    void start(){

        System.out.println("Use the Button to start me");
    }
}
class Tesla extends Car {
    @Override
    void start() {
        System.out.println("Use mobile App to start me");
    }

    @Override
    void park() {
        System.out.println("Use parking sensors to park me");
    }
}

     class Toyota extends Car{


}
