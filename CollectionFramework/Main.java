package CollectionFramework;

public class Main {
    public static void main(String[] args) {
        Student Narayana = new Student(12,9.80f,"Narayana");
//        Narayana.greetStudent();
        Student Hash = new Student(Narayana);
        Hash.greetStudent();


        //access the variable and give them the values
//        student1.rollNumber = 21;
//        student1.firstName = "Narayana";
//        student1.marks = 90.80f;

//        System.out.println(student1.rollNumber);
//        System.out.println(student1.marks);
//        System.out.println(student1.firstName);


    }
}
