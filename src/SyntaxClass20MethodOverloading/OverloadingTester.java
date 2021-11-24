package SyntaxClass20MethodOverloading;

public class OverloadingTester {
    public static void main(String[] args) {

        Overloading.add(10, 10);
        Overloading.addDouble(10.5, 10.5);
        Overloading.addIntDouble(10, 10.5);
        Overloading.addInt(10, 10, 10);
        int[] arr = {10, 10};
        Overloading.addArray(arr);


    }
}




