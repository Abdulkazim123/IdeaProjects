package SyntaxClass21HW;

public class StudentTester {
    public static void main(String[] args) {

        /*SyntaxStudent syntaxStudent=new SyntaxStudent();
        syntaxStudent.Study();
        syntaxStudent.Tester();
        syntaxStudent.Read();
        syntaxStudent.coding();

        CollegeStudent collegeStudent=new CollegeStudent();
        collegeStudent.Study();
        collegeStudent.moreTime();
        collegeStudent.doHW();

        SchoolStudent schoolStudent=new SchoolStudent();
        schoolStudent.Read();
        schoolStudent.spendMoreHours();
        schoolStudent.doHW();
       */
        Student[] students={new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for(Student st: students){

            st.Study();
            st.Read();
            st.doHW();

            if(st instanceof SyntaxStudent){
                ((SyntaxStudent)st).coding();
            }


        }








        }
    }








