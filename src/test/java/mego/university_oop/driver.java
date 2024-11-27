package mego.university_oop;

public class driver extends person{

    private  String firstName;
    private  String lastName;


    public driver(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getDriverLicense(String licenseLevel){
        System.out.println("Driver license level is "+licenseLevel);
return licenseLevel;

    }
}
