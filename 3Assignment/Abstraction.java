abstract class Payment {

    // Abstract method
    abstract void pay(double amount);

    // Normal method
    void message() {
        System.out.println("Payment processing...");
    }
}

class UPI extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

class Card extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card.");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Payment payment = new UPI();

        payment.message();
        payment.pay(499);
    }
}
