package SyntaxClass22HW;

public class ComputerTester {
    public static void main(String[] args) {

        Computer[] computers={new Apple("Aplle", "Imac 24 inch"),
                new Lenovo("Lenovo","ThinkPadP15"),new HP("HP","envy 13")
                ,new Dell("Dell","XPS 15") };

       for(Computer c:computers){
           c.screen();
           c.wirlessMouse();
           c.keyboard();

           if(c instanceof Apple){
               ((Apple)c).securityContain();
           }
           if(c instanceof Dell){
               ((Dell)c).exellentPerformanec();
           }
           if ( c instanceof Lenovo){
               ((Lenovo)c).lessSecure();
           }

       }


    }
}
