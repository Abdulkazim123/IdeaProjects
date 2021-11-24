package SyntaxClass20MethodOverloading;

public class Overloading {
    static void add(int num1,int num2){
        System.out.println(num1+num2);
    }

    static void addIntDouble(int num1,double num2){
        System.out.println(num1+num2);
    }

    static void addInt(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }
    static  void addDouble(double num1,double num2){
        System.out.println(num1+num2);
    }

    static  void addArray(int[] array){
        int sum=0;
        for (int number:array
        ) {
            sum=sum+number;
        }
        System.out.println(sum);

    }




}
