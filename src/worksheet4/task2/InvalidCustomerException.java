package worksheet4.task2;

public class InvalidCustomerException extends Exception{
    public InvalidCustomerException(String message){
        super(message+ " is invalid");
    }
}
