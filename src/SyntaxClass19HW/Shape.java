package SyntaxClass19HW;

public class Shape {
    //Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    // In circle class create a method to calculate the area of circle. Test your code

double raduis;

    public Shape(double raduis) {
        this.raduis = raduis;
    }
}
class Circle extends Shape {

     Circle(int raduis) {
        super(raduis);
    }

    void count() {
        double area = 2.5 * raduis * raduis;
        System.out.println("The area is "+area);
    }
}

 class ShapeTester{
     public static void main(String[] args) {

         Circle c=new Circle(3);
         c.count();

     }
 }

