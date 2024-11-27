package mego.university_oop;

import java.util.Arrays;
import java.util.List;

public class universityMainPart {
    public static void main(String[] args) {
        student student1 = new student("Omer","Miller",45);
        student student2 = new student("Omer","Adam",44);
        driver driver1 = new driver("John","Smith");
        List<Integer> grades = Arrays.asList(23,45,67,89,66);
        student1.getAvg(grades);
                student2.getAge(34);
                driver1.getDriverLicense("a");
                driver1.getAge(44);


    }

}
