package worksheet4.task2;

public class MissingShippingInfoException extends Exception{
    public MissingShippingInfoException(){
        super("Invalid Shipping Info");
    }
}
