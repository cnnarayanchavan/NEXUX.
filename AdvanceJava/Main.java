package RemoteRepoNexux.AdvanceJava;

public class Main {
    public static void main(String[] args) {
        //all execution will be here only..

        //here we have reference of interface and the object of classes
        Animal animal = new Dog();
//        animal.makeSound();

        animal = new Cat();  //here now animal variable is holding Cat object
//        animal.makeSound();


        //This is for decoupling example
        PaymentGateway pal = new PayWithPayPal();
        SelectMethod select = new SelectMethod(pal);
        select.makePayment(67364.99);

        PaymentGateway moon = new PayWithMoonPay();
        select = new SelectMethod(moon);
        select.makePayment(67364.99);


    }
}
