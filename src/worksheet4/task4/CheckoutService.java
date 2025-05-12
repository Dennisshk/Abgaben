package worksheet4.task4;

public class CheckoutService {
    //SRP: eine Klasse für Bezahlungen, eine für process Payment
    //Interface: Keine konkreten Elemente, abstraktes Element
    public void processPayment(PaymentProvider p,double amount){
        //Liskov: Es wird mit abstrakter Klasse PaymentProvider p gearbeitet
        p.pay(amount);
    }
    //Open closed: Neue Klassen implementieren das Interface
    public static void main(String[] args){
        PaymentProvider p = new CreditCardPayment();
        PaymentProvider p2 = new PayPalPayment();
        new CheckoutService().processPayment(p,4567);
        new CheckoutService().processPayment(p2,4567.87654);
    }
}
