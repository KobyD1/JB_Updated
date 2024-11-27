package mego.oopExample;

public class utils {

    public static void printSomething(String pattern){
        System.out.println(pattern);


    }

    static boolean isGradePassByUtils(Integer grade){
        if (grade>70) {
            System.out.println("The student pass the grade is "+grade);
            return true;
        }
        else if ((grade>50)&&(grade<71)){
            grade = grade+10;
            System.out.println("The student pass the grade is "+grade);
            return true;

        }
        else {
            System.out.println("The  grade is " + grade);
            return false;


        }

    }

}
