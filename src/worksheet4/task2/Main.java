package worksheet4.task2;

public class Main {
    public static void main(String[] args) {
        String city="Munich";
        int zip = 80331;
        String country = "Germany";
        int id = -123;
        
        Customer c = null;
        try{
            c = newCustomer(city, zip, country, id);
        } catch (InvalidCustomerException e){
            System.out.println(e.getMessage());
        } catch (MissingShippingInfoException e){
            System.out.println(e.getMessage());
        } catch (InvalidShippingInfoException e){
            System.out.println(e.getMessage());
        }finally{
         if(c!=null)System.out.println(" Benutzer Erfolgreich angelegt");
        }

        /*
        1) What generally happens if an exception is thrown but not caught?
        Unchecked Exceptions (Runtime Exceptions/Errors): Das Programm oder der Thread wird beendet und die Exception wird ausgegeben.
        Checked Exceptions (erben nicht von Runtime Exceptions/Errors): Nicht möglich, da der Compiler dies überprüft.
        2) Discuss the advantage of catching specific exceptions (e.g., InvalidShippingInfoException) rather than just catching a general Exception.
        Dadurch kann zu jeder Exception in einem jeweiligen catch-Block eine spezifischere Fehlerbehandlung erfolgen.
        Es ist klarer, von wo die Exception geworfen wurde.
        3) Explain when a try with resources should be used an what its advantages are.
        Wenn es Ressourcen gibt, welche geschlossen werden müssen. 
        Ein try with ressources beendet seine Ressourcen immer automatisch, egal wie das try-Statement verlassen wird.
         */
    }

    public static Customer newCustomer(String city, int zip, String country, int id) throws InvalidCustomerException,MissingShippingInfoException,InvalidShippingInfoException{
        ShippingInfo info = new ShippingInfo(city,zip,country);
        Profile profile = new Profile(info);
        Customer customer = new Customer(profile,id);

        return customer;
    }
}
