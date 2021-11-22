package SyntaxClass20MethodOverloading;

public class Task1 {
    /*Create 1 class in which create a methods
     * that will calculate the area (volume in case of box) of
     * Rectangle
     * Square
     * Box
     * Use separate class to test your code*/

    public void calculateArea(double length, double width) {
        System.out.println(length * width);
    }


    public void calculateVolum(double length, double width, double height) {
        System.out.println(length * width * height);

    }
}



