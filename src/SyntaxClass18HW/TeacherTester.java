package SyntaxClass18HW;
public class TeacherTester {
    public static void main(String[] args) {
        MathTeacher m=new MathTeacher();
        m.name="Peter";  m.yearofTeaching=5; m.annualSalary=55000;
        m.printAllInfo();
        System.out.println();
        PianoTeacher p=new PianoTeacher();
        p.name="Mike"; p.yearofTeaching=8; p.annualSalary=50000;
        p.printAllInfo();
        System.out.println();
        ChemistryTeacher c=new ChemistryTeacher();
        c.name="Erin";
        c.yearofTeaching=10;
        c.annualSalary=52000;
      c.printAllInfo();




    }
}
