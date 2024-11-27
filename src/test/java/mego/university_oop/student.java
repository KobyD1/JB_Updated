package mego.university_oop;

import java.util.List;

public class student extends person {
    private String firstName;
    private String lastName;
    private int age;

    public student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;


    }

    public Double getAvg(List<Integer> grades){
        int sum = 0;
        for (int grade :grades){
            sum = sum+grade;

        }
        Double avg = (double) (sum/grades.size());
        return avg;



    }
}