package worksheet4.task4;

public class CheckoutService {

    public void processPayment(PaymentProvider p,double amount){
        p.pay(amount);
    }

    public static void main(String[] args){
        PaymentProvider p = new CreditCardPayment();
        PaymentProvider p2 = new PayPalPayment();
        new CheckoutService().processPayment(p,4567);
        new CheckoutService().processPayment(p2,4567.87654);
    }
}
