package copyconstructor;

public class Client {

    public static void main(String[] args) {

        Student student = new Student(27,1, 2018, 93.0);


        Student st1 = student;

        System.out.println("");

        Student st2 = new Student(student);

        System.out.println("");

    }
}
