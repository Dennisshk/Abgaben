package worksheet4.task4;

public class PayPalPayment implements PaymentProvider{
    @Override
    public void pay(double amount) {
        System.out.println(amount+" with Paypal");
    }
}
