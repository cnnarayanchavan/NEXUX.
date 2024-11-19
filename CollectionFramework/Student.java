package CollectionFramework;

public class Student {

    int rollNumber;
    float marks;
    String firstName;

    //initializing object using constructors
    //parameterised constructor.
    public Student (int rollNumber, float marks, String firstName) {
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.firstName = firstName;
    }

    //non-parameterised constructor.
    public Student () {
        System.out.println("Student Constructor(non-Parameterised) called");
        System.out.println("your roll number is: " + rollNumber);
    }

    //copy constructor
    Student (Student other) {
        this.rollNumber = other.rollNumber;
        this.marks = other.marks;
        this.firstName = other.firstName;
    }

    //function for greet and print details of students
    public void greetStudent() {
        System.out.println("Hey there Welcome "+firstName);
        System.out.println("your roll number is "+rollNumber + " and you obtained "+marks+" marks.");
    }
}
