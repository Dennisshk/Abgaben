package worksheet4.task4;

public class CreditCardPayment implements PaymentProvider{
    public void pay(double amount) {
        System.out.println(amount+" with credit card");
    }
}
