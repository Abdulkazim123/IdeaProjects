package SyntaxClass18HW;
public class Task3 {
    // Write a Java program called Teacher.
    // Identify features and behaviour of that Class.
    //Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    //that would have it their own features and behaviour. Test all 4 classes
    public static void main(String[] args) {
    MathTeacher1 m=new MathTeacher1();
    m.name="Demir";
    m.teachMath();

    Chemistry1 c=new Chemistry1();
    c.name="Mike";
    c.teachChemistry();
}
}
class Teacher1{
    String name;
    void teach(){
        System.out.println("Teachers teach subjects");
    }

}
class MathTeacher1 extends Teacher1{
    void teachMath(){
        System.out.println(name+"Teaches math");
    }
}
class Chemistry1 extends Teacher1{
    void teachChemistry(){
        System.out.println(name+"Teaches chemistry");
    }

}
class piano11 extends Teacher1{
    void teachPiano(){
        System.out.println(name+"Teaches piano");
    }
}