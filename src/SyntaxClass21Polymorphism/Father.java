package SyntaxClass21Polymorphism;

public  class Father {
    String name;
    Father(String name){
        this.name=name;
    }

    void sleep(){
        System.out.println(name+" like to sleep 8 hours");
    }
    void eat(){
        System.out.println(name+" like to eat Veggie");
    }
}
class Son extends Father{

    Son(String name){
        super(name);
    }
    void sleep(){
        System.out.println(name+" like to sleep 10 hours");
    }

    void eat(){
        System.out.println(name+" like to eat Kabab");
    }
    void playVideoGames(){
        System.out.println(" I can play video games");
    }
}
class Son2 extends Father {

    Son2(String name){
        super(name);
    }
    void eat(){
        System.out.println(name+" like to eat Fish");
    }
}