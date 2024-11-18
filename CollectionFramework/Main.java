package CollectionFramework;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();

        //access the variable and give them the values
        student1.rollNumber = 21;
        student1.firstName = "Narayana";
        student1.marks = 90.80f;

        System.out.println(student1.rollNumber);
        System.out.println(student1.marks);
        System.out.println(student1.firstName);
    }
}
