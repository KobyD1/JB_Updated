package Oct2024FirstTraining;

public class stringExample {
    public static void main(String[] args) {

        String fullName1 = "Leo messi";
        String fullName2 = "Efrat Itzhak";
        int index1 = fullName1.indexOf(" "); // find the position of space into brackets
        int index2 = fullName1.indexOf("m"); // find the position of space into brackets

        Boolean isContain1 = fullName1.contains("ssi");
        int lengthOfAllString  = fullName1.length();// find the length of string
        Boolean isContain = fullName1.contains("Leo");
        String firstName = fullName1.substring(0,index1);
        String lastName = fullName1.substring(index1,lengthOfAllString);
        System.out.println("Test end");
        System.out.println(lastName);


    }
}
