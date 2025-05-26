package worksheet4.task1;

public class Main {
    public static void main(String[] args) {
        ShippingInfo info = new ShippingInfo(" Munich", 80331, " Germany ");
        Profile profile = new Profile(info);
        Customer customer = new Customer(profile, 123);
        System.out.println(" Shipping to: " +customer.getProfile().getShippingInfo().getCity());
        //law of Demeter (keine verketteten Aufrufe), die Klassen sollen zu sehen sein und es soll über Getter/Setter aufgerufen werden: 
        Profile p = customer.getProfile();
        ShippingInfo s = p.getShippingInfo();
        System.out.println(" Shipping to: " +s.getCity());
        //Der Code hat wenig dependency injection, da nur Customer von profile abhängt und dieses wiederum von shippingInfo.
        //Konstruktor dependecy injection: Objekte werden über Konstruktor übergeben, keine eigenen Objekte in Klassen angelegt
    }
}
