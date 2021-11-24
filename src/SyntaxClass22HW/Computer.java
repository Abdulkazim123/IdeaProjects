package SyntaxClass22HW;
public class Computer {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each object and execute available method
     String name;
     String model;
     Computer(String name, String model) {
        this.name = name;this.model = model;
    }
    void screen(){
        System.out.println(name+" "+model+ " contain a  screen");
    }
    void wirlessMouse(){
        System.out.println(name+" " +model+" has  mouse");
    }
    void keyboard(){
        System.out.println(name+" "+model+ " has keyboard");
    }
}
class Apple extends Computer{
    Apple(String name, String model) {
        super(name, model);
    }
    @Override
    void screen(){
        System.out.println(name+ "  "+model+ " contain a great screen");
    }
    void mouse(){
        System.out.println(name+""+model+" has good wirless mouse");
    }void securityContain(){System.out.println(name+" " +model+ " is more secure");}
}
class Lenovo extends Computer{
    Lenovo(String name, String model) {
        super(name, model);
    }
    @Override
    void keyboard(){
        System.out.println(name+""+model+" has good keyboard");
    }
    void lessSecure(){System.out.println(name+""+model+" is less secure");}
}
class HP extends Computer{ HP(String name, String model) {
        super(name, model);
    }
    @Override
    void screen(){
        System.out.println(name+" "+model+ " has good screen");
    }
    void helpFulSystem(){
        System.out.println(name+" " +model+ " has helpful system opretion ");
    }
}
class Dell extends  Computer{
    Dell(String name, String model) {
        super(name, model);
    }
    void keyboard(){System.out.println(name+" "+model+ " has good keyboard");
    }
    void exellentPerformanec(){
        System.out.println(name+" "+model+ " has exellent system perfarmance");
    }
}