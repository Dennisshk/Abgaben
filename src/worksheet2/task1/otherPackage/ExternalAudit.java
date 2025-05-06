package worksheet2.task1.otherPackage;

import worksheet2.task1.accountPackage.Account;

public class ExternalAudit {
    public void printAccountInfo(Account a){
        //Fremde Klasse kann nur auf öffentliche Attribute zugreifen
        System.out.println(a.owner);
        //System.out.println(a.balance);
        System.out.println(a.getBalance());
        //System.out.println(a.pin);
        System.out.println(a.getPin());
        //System.out.println(a.internalNote);
        System.out.println(a.getInternalNote());
    }
}
