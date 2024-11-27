package mego.oopExample;

import java.util.Arrays;
import java.util.List;

public class gradeCalc {
    public static void main(String[] args) {
        utils utilsToTest = new utils();
        flower rose = new flower();
        flower jasmin = new flower();
        utilsToTest.isGradePassByUtils(23);
        utilsToTest.printSomething("hi");
        List<Integer> grades = Arrays.asList(12,70,89,45,65);
        for (Integer grade:grades){
           boolean isPass=  isGradePass(grade);
           if (isPass){
               System.out.println("The student pass");
           }
           else {
               System.out.println("The student failed");
           }
        }
    }
    public static boolean isGradePass(Integer grade){
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

