package mego;

public class flowControlExample {

    public static void main(String[] args) {
        int ageUnderTest = 19;
        String ageAsString = "22";

        if (ageUnderTest > 18) {
            ageUnderTest = ageUnderTest + 3;
            System.out.println("you are above 18 the actual age is " + ageUnderTest);
        } else if (ageUnderTest > 12) {
            System.out.println("you are more than 12");

        } else {
            System.out.println("you are less than 18");
        }

    }

}
