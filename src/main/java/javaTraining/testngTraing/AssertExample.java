package javaTraining.testngTraing;



import org.testng.Assert;
public class AssertExample {

    public static void main(String[] args) {

        Assert.assertEquals("originalTitle", "originalTitle","Original title is not as expected");
        Assert.assertEquals("originalTitle", "originalTitleWithFailure","Original title is not as expected as failure example ");





        System.out.println("Test end");


    }
}
