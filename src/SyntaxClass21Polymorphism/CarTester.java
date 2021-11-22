package SyntaxClass21Polymorphism;

import java.util.concurrent.Callable;

public class CarTester {
    public static void main(String[] args) {
       /* BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        bmw.park();

        Tesla tesla=new Tesla();
        tesla.start();
        tesla.stop();
        tesla.park();

        Toyota toyota=new Toyota();
        toyota.start();
        toyota.stop();
        toyota.park();*/

        Car[] cars={new BMW(), new Tesla(), new Toyota()};

        for(Car car:cars){// short way that we can do polymorphism, here onsteed of writting all name of object we use
           // this method

            car.start();
            car.stop();
            car.park();
        }



    }
}
