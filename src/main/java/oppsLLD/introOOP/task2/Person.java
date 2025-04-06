package oppsLLD.introOOP.task2;

import java.util.Arrays;

public class Person {

    int age;
    String name;



    public Person(String name, int age){

        this.age = age;
        this.name = name;



    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Person person = new Person("santosh", 28);
        System.out.println(person.toString());

    }
}
