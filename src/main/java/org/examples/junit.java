package org.examples;


import org.junit.*;


public class junit {


    @Before
    public void init() {
        System.out.println("into before test ");
    }

    @After
    public void teardown() {
        System.out.println("into after test ");

    }

    @Test()
    public void passTest() {
        Assert.assertEquals("mismatch found", 4, 4);
        Assert.assertNotEquals(4,3);

    }

    @Test()
    public void failTest() {
        Assert.assertEquals("mismatch found", 5, 4);

    }

}
