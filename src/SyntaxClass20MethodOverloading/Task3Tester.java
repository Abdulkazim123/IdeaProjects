package SyntaxClass20MethodOverloading;


public class Task3Tester {




    public static void main(String[] args) {
        Task3.method(false);
        Task3.method(10l);
        Task3.method(10f);

       Programming programming=new Programming();
       Task3.method(  programming);


    }

}
