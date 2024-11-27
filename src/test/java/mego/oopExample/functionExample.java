package mego.oopExample;

import java.util.Arrays;
import java.util.List;

public class functionExample {

    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(1,3,5,67,34);
        List<Integer> nums2 = Arrays.asList(2,5,7,8,23,67,45);
        List <Integer> nums3 = Arrays.asList(4,6,8,12,2,1,4,7);
        Integer summery = listAnalyze(nums1,"first list to test");
        Integer summery2 = listAnalyze(nums2,"second list to test");
        if (summery2>summery){
            System.out.println("Summery of second list is more than first list");
        }else {

            System.out.println("Summery of first list is more than second list");

        }





    }  // end of psvm
    public static Integer listAnalyze(List <Integer> listToTest, String pattern){
        System.out.println("start to analyze the list "+pattern);
        int length = listToTest.size();
        Integer summery  = 0 ;
        for (Integer num:listToTest){

            summery = summery+num;

        }

return summery;
    } // end of class

}
