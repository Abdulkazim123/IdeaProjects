package SyntaxClass21Polymorphism;

public class FatherTester {

    public static void main(String[] args) {
        Father son = new Father("father");// we only can store this info
        // Son fath= new Father("SharifsFather");// we can not store this info
       // Son2 sharifObj = (Son2) son; // we will get error
    }
}