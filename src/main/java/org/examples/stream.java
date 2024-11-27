package org.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream {

    public static void main(String[] args) {
        List<String> cars = Stream.of("Ford", "Nissan", "Kia", "Renault")
                .collect(Collectors.toList());     // collect - arrange all stream into data structure
        int l = cars.size();
        String firstCar = cars.get(0);
        System.out.println(firstCar);
        cars.add("Honda");
        System.out.println(cars);
        cars.forEach(car -> {
            System.out.println(car.length());
        });
        Boolean isContains = cars.contains("Ford");
        System.out.println("### Filters ###");
        List<String> cars_filtered = cars.stream().filter(car -> car.length() > 3)  // filter by condition
                .collect(Collectors.toList());
        cars_filtered.stream().forEach(car -> {
            System.out.println(car);
        });
        System.out.println("### Filters 1###");

        List<String> cars_filtered1 = cars.stream().filter(car -> car.contains("or")).toList();  // filter by condition
        List<String> cars_filtered2 = cars.stream().filter(car -> car.contentEquals("Kia")).toList();  // filter by condition

        System.out.println(cars_filtered1);

    }


}
