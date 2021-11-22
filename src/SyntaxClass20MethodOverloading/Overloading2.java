package SyntaxClass20MethodOverloading;

public class Overloading2 {

    static void add(int num1, int num2){
        System.out.println(num1+num2);

    }
    static void add( int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    static void add(int num1, double num2){
        System.out.println(num1+num2);
    }

    static void add(double num1, float num2){
        System.out.println(num1+num2);

    }


    static void add(double num, double num2){
        System.out.println(num+num2);
    }

    static void add(int []array){
        int sum=0;
        for(int number:array){
            sum=sum+number;
        }
        System.out.println(sum);
    }
}

