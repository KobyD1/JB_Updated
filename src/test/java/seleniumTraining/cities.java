package seleniumTraining;


import java.util.Arrays;
import java.util.List;

public class cities {

    public static void main(String[] args) {
        List<String> citiesForTest = Arrays.asList(new String[]{"Haifa", "Rome","Amsterdam","london","Milano"});
        int maxLength = 0 ;
        for (String city :citiesForTest){
            int len = city.length();
            System.out.println("the length of tested city is "+len);
            if (maxLength<len){

                maxLength=len;
            }


        }
        System.out.println("max len is "+maxLength);
    }
}
