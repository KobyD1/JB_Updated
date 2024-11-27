package org.examples;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class dictionary_example {

    public static void main(String[] args) {

        Map myMap = new HashMap() {{
            put("foo", "bar");
            put("key", "value");
            //etc
        }};

        Dictionary<String, Integer> dictExample = new Hashtable<>();

        // Adding elements to the dictionary
        dictExample.put("A", 1);
        dictExample.put("B", 2);
        dictExample.put("C", 3);

        // Getting values from the dictionary
        int valueA = dictExample.get("A");
        System.out.println("Value of A: " + valueA);

        // Removing elements from the dictionary
        dictExample.remove("B");

        System.out.println(dictExample);
    }
}
