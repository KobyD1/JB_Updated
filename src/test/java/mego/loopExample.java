package mego;

import org.openqa.selenium.devtools.v111.input.Input;

public class loopExample {

    public static void main(String[] args) {

        String a = new Input().toString();

        int numStart = 6;
        int numEnd = 10;

        if (numStart<numEnd+1)
        {
            System.out.println("num start define incorecctly ");

        }

        for (int i = numStart ;i<numEnd ;i++){
            System.out.println("The value of i is "+i);
            int num = 3 ;

        }
//        Boolean isPass = true;
//        while (isPass){
//
//            System.out.println("is  pass is false ");
//            isPass = false;
//        }
    }
}
