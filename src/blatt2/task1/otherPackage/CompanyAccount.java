package blatt2.task1.otherPackage;

import blatt2.task1.accountPackage.Account;

public class CompanyAccount extends Account {
    private String company;

    public CompanyAccount(String owner, double balance, int pin, String internalNote, String company) {
        super(owner, balance, pin, internalNote);
        this.company = company;
    }

    public void printAccountInfo(CompanyAccount a){
        //Erbende Klasse kann zusätzlich zu öffentlichen Attributen auch auf protected zugreifen
        System.out.println(a.owner);
        //System.out.println(a.balance);
        System.out.println(a.getBalance());
        System.out.println(a.pin);
        //System.out.println(a.internalNote);
        System.out.println(a.getInternalNote());


        //Unterschied zwischen protected vs. private+Getter
        //Protected hat keine Bedingungen:
        int i = this.pin;
        this.pin = -2;
        //bei private Bedingungen durch getter
        double j = this.getBalance();
        //es muss auch keinen setter geben
    }
}
