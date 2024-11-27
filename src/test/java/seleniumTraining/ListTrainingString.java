package seleniumTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTrainingString {
    public static void main(String[] args) {
        List<String> pricesAsFixedSize = Arrays.asList("23.3$","12.7$","876.45$");
        List<String> prices = new ArrayList<>();

        for (String price :prices){
            //23.3$
            price = price.replace("$","");
            //23.3
           int index =  price.indexOf(".");
           String priceBeforeCalc =price.substring(0,index);
           Integer.parseInt(priceBeforeCalc);// casting from string to int
           String temp = String.valueOf(priceBeforeCalc);  // casting from int to string
            System.out.println("stop here ");
        }
    }
}
