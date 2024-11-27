package seleniumTraining;

public class boom7 {

    public static void main(String[] args) {
        for (int i = 0 ;i<100;i++){
            if (i%7 == 0){
                System.out.println("7 Boom found the number is "+i);

            }
            // example how  to casting from String to integer
           Integer.parseInt("12121");
            // example how to casting from integer to string
            String numAsString = String.valueOf(i);
            if (numAsString.contains("7")){
                System.out.println("7 Boom");

            }

        }
    }
}
