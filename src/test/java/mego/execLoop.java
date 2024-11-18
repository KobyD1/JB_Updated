package mego;

public class execLoop {
    public static void main(String[] args) {

        int numMin = 5;
                int numMax= 20;
                if (numMin>numMax+1){
                    System.out.println("mismatch found ");
                    int temp = numMin;
                    numMin=numMax;
                    numMax=temp;

                }

                for (int i = numMin;i < numMax;i++ ){
                    if (i%3==0){
                        System.out.println("match found "+i+" dived by 3");
                    }
                }


    }

}
