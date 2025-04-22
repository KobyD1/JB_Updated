package Examples;

import java.util.ArrayList;
import java.util.List;

public class listDemo {


    public static void main(String[] args) {
        List<String> li = new ArrayList<>();

        // Adding elements in List
        li.add("Java");
        li.add("Python");
        li.add("DSA");
        li.add("C++");

        System.out.println("Elements of List are:");

        // Iterating through the list
        for (String s : li) {
            System.out.println(s);
        }


    }
}
