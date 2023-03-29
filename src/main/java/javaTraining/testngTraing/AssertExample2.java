package javaTraining.testngTraing;

import org.testng.Assert;

public class AssertExample2 {

    public static void main(String[] args) {

        int num1 = 5 ;
        int num2 = 6 ;
        Assert.assertEquals(30, num2 * num1 ,"total is not as expected ");
        System.out.println("we pass assert");

        Assert.assertNotEquals(25, num2 * num1 ,"total is not as expected negative example ");

        System.out.println("test end ");


    }
}
