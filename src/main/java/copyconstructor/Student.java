package copyconstructor;

public class Student {
    private int age;
    private int id ;
    private int gradYear;
    private double psp;
    private Exam examEnrollment;



    public  Student(){

    }

    public Student(int age,int id , int gradYear, double psp){

        this.age = age;
        this.id = id;
        this.gradYear = gradYear;
        this.psp = psp;
        this.examEnrollment = new Exam(1,50);

    }
//copy constructor
    Student(Student other){
        this.age = other.age;
        this.id = other.id;
        this.gradYear = other.gradYear;
        this.psp = other.psp;
        //shallowcopy: copying the reference
       // this.examEnrollment = other.examEnrollment;

        //
        this.examEnrollment = new Exam(other.examEnrollment);
    }
}
