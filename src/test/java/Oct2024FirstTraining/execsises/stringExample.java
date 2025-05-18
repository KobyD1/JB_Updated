package Oct2024FirstTraining.execsises;

public class stringExample {
    public static void main(String[] args) {

        String fullName1 = "Leo Messi";
        int num = 0 ;
        Boolean isPass = true;

        int index1 = fullName1.indexOf(" "); // find the position of space (define into brackets)
        int index2 = fullName1.indexOf("M"); // find the position of M (into brackets)

        int lengthOfAllString  = fullName1.length();// find the length of string
        Boolean isContain = fullName1.contains("Leo");// find if string contains sub string
        String firstName = fullName1.substring(0,index1);  // getting sub string acording indexes

        String spaceExample = " Rishon ";
        String spaceExamleResult = spaceExample.trim();  // remove all spaces in start and the end , not in the middle

        String replaceExample = "New York";
        String replaceExampleResult = replaceExample.replace("York","York city");  // replace "York" with "York city"

        System.out.println("Test end");


    }
}
