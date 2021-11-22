package SyntaxClass21HW;
public  class Student {
    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
    void Study()
    {System.out.println("Most students are eager to study");}
    void Read () {
        System.out.println(" students like to  read");}
    void doHW() {
        System.out.println("Students do their HW");}
}
class SyntaxStudent extends Student{
    @Override
    void Study(){System.out.println(" Studying java is a dream for Syntax students");
    }
    void  Tester(){System.out.println("Syntax stundents are eager to be good tester");}
    @Override
    void Read(){System.out.println("Syntax stundent like to read slides");
    }
    void coding(){System.out.println("Writting codes help Syntax students to become good tester");}
}
class CollegeStudent extends Student {
    @Override
    void Study(){System.out.println("Students study more in college");}
    void moreTime(){System.out.println("Students spend more time in college");}
    @Override
    void doHW(){System.out.println("Students do more HW in college");}
}
class SchoolStudent extends Student{
     @Override
    void Read(){System.out.println("school students read more ");
     }
     void spendMoreHours(){System.out.println("school students spend more hours in school");}
     @Override
    void doHW(){System.out.println("school students usually not worry about doing HW");
     }
}