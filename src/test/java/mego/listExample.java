package mego;

//import java.util.Arrays;
//import java.util.List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listExample {

    public static void main(String[] args) {

        List<String> pricesAsFixedSize = Arrays.asList("23.3$","12.7$","876.45$");
        List<String> prices = new ArrayList<>();

        int len = prices.size();
         String priceNumberOne =  prices.get(1);
         prices.add("24.5$");
         prices.add(2,"45.5$");
        for (String price:prices){
            System.out.println(price);

        }


    }

}
