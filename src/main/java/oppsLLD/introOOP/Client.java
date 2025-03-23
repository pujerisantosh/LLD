package oppsLLD.introOOP;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "santosh";
        s1.age = 28;
        s1.gradYear = 2018;
        s1.course = "Backend";

        s1.printDetails();
    }


}
