package AdvanceJava;

public interface Animal {
    public void makeSound ();
    public static void eat () {
        System.out.println("Animal Eating...");
    }
}

class Dog implements Animal {

    @Override
    public void makeSound () {
        System.out.println("Dog MakeSound... woof!!");
    }
}

class Cat implements Animal {
    public void makeSound () {
        System.out.println("Cat MakeSound... meow!!");
    }
}
