package mego.university_oop;

public class lecture extends person{

    private String department;

    public lecture (String department){
    this.department = department;

}
    public double getSalary (int salary){
        double salaryAfterTax = salary*0.7;
        return salaryAfterTax;


    }

}
