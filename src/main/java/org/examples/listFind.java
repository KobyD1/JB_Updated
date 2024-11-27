package org.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class listFind {

    public static void main(String[] args) {
        List<String> cities = Stream.of("London","Rome","Lod","Haifa").collect(Collectors.toList());
        cities.forEach(city->{
            if (city.length()>3)
                System.out.println(city);
            else
                System.out.println(city.length());

        });
    }
}
