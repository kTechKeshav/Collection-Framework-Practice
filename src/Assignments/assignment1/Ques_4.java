package Assignments.assignment1;

abstract class Payment {
    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method to be overridden
    abstract void process();
}

class CurrencyFormatter{
    private double amount;

//    Given below how the method overloading works.
    public String format(double amount){
        this.amount = amount;
        return "₹"+this.amount;
    }

    public String format(double amount, String symbol){
        this.amount = amount;
        return symbol+this.amount;
    }
}

// Subclass for Credit Card payment
class CreditCardPayment extends Payment {
    String cardNumberLast4;

    public CreditCardPayment(double amount, String cardNumberLast4) {
        super(amount);
        this.cardNumberLast4 = cardNumberLast4;
    }

    @Override
    void process() {
        CurrencyFormatter formatter = new CurrencyFormatter();
        System.out.println("Processing credit card payment of " +
                formatter.format(amount) + " using card ending with " + cardNumberLast4);
    }
}

// Subclass for UPI payment
class UpiPayment extends Payment {
    String upiId;

    public UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void process() {
        CurrencyFormatter formatter = new CurrencyFormatter();
        System.out.println("Processing UPI payment of " +
                formatter.format(amount, "$") + " from UPI ID: " + upiId);
    }
}

public class Ques_4 {
    public static void main(String[] args) {
        CurrencyFormatter formatter = new CurrencyFormatter();
        System.out.println("Formatted amount (default): " + formatter.format(1500.0));
        System.out.println("Formatted amount (custom): " + formatter.format(1500.0, "€"));

        System.out.println();

        // Run-time polymorphism demo
        Payment payment1 = new CreditCardPayment(2500.0, "1234");
        Payment payment2 = new UpiPayment(1800.0, "john@upi");

        payment1.process(); // Runtime: CreditCardPayment.process()
        payment2.process(); // Runtime: UpiPayment.process()
    }
}
