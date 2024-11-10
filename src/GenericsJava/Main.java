package GenericsJava;

public class Main {
    public static void main(String[] args) {
        GenericExample<String> example = new GenericExample<>("Narayana");
        GenericExample<Integer> example2 = new GenericExample<>(1);
        example.printNumber();
        example2.printNumber();
    }
}
