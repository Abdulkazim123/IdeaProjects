package SyntaxClass21Overriding;

public class Degree {
    //   Create a class 'Degree' having a method 'getPrerequisite' that prints ""
    //   To get a degree you need high school diploma"".
    //Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
    // In Masters class override method 'getPrerequisite'.
    //Call the method by creating an object of each of the three classes.

    void getPrerequisite(){
        System.out.println("To get a degree you need a high schoool diploma");
    }

}
class  Bechelore extends Degree{


    }

class Master extends Degree{
    void getPrerequisite() {
        System.out.println("To get a Master degree you need to have Bechelors degree");
    }
}
class Tester{
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();
        Master master=new Master();
        master.getPrerequisite();
        Bechelore bechelore=new Bechelore();
        bechelore.getPrerequisite();


    }
}