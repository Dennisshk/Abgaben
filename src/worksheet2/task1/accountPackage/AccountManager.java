package worksheet2.task1.accountPackage;

public class AccountManager {
    public void printAccountInfos(Account a){
        //Klassen im gleichen Paket können nicht auf private zugreifen
        System.out.println(a.owner);
        //System.out.println(a.balance);
        System.out.println(a.getBalance());
        System.out.println(a.pin);
        System.out.println(a.internalNote);
    }
}
