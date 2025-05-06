package worksheet2.task1.accountPackage;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote;

    public Account(String owner, double balance, int pin, String internalNote) {
        this.owner = owner;
        this.balance = balance;
        this.pin = pin;
        this.internalNote = internalNote;
    }

    public int getPin() {
        return pin;
    }
    public boolean changePin(int oldPin, int newPin){
        if(this.pin==oldPin && newPin > 0){
            this.pin=newPin;
            return true;
        }else return false;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if(balance>=0) this.balance = balance;
    }

    public String getInternalNote() {
        return internalNote;
    }
    public void setInternalNote(String internalNote, int pin) {
        if(pin==this.pin) this.internalNote = internalNote;
    }

    public void printAccountInfo(Account a){
        //Eigene Klasse kann auf alles zugreifen:
        System.out.println(a.owner);
        System.out.println(a.balance);
        System.out.println(a.pin);
        System.out.println(a.internalNote);
    }
}
