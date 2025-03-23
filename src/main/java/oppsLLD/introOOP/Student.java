package oppsLLD.introOOP;

public class Student {

    // data attributes
    String name ;
    int age;
    int gradYear ;
    String course;


    void raiseHR(){
        System.out.println("HR Raised");
    }

    void rateClass(){
        System.out.println("Class Rate");
    }

    void printDetails(){
        System.out.println("student Name: " + name);
        System.out.println("age: " + age);
        System.out.println("gradYear: " +gradYear);
        System.out.println("course:" + course);
    }
}
