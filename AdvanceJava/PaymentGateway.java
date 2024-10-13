package RemoteRepoNexux.AdvanceJava;

public interface PaymentGateway {

    //method for payment platform
    public void chooseGateway (double amount);
}

class PayWithPayPal implements PaymentGateway {
    public void chooseGateway (double amount) {
        System.out.println("Amount "+amount+" paid with PayPal thank you.");
    }
}

class PayWithMoonPay implements PaymentGateway {
    public void chooseGateway (double amount) {
        System.out.println("Amount "+amount+" paid with MoonPay thank you.");
    }
}

//class for actually performing decoupling
class SelectMethod {
    private PaymentGateway payment;

    //initialize using constructor
    public SelectMethod (PaymentGateway payment) {
        this.payment = payment;
    }

    //method for calling the actual object for payment.
    public void makePayment (double amount) {
        payment.chooseGateway(amount);
    }
}