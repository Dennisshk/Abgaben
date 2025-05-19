package worksheet5.task4;

public class BankAccount {
    private int balance;
    public BankAccount (int initialBalance ) {
        this.balance = initialBalance ;
    }

    //Synchronized gilt für dieses Objekt (this)
    public synchronized boolean withdraw(int amount){
        if(amount<=balance){
            balance-=amount;
            return true;
        }else{
            return false;
        }
    }
    public synchronized void deposit(int amount){
        balance+=amount;
    }

    public int getBalance () {
        return balance;
    }
}
