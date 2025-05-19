package worksheet5.task4;

public class TransactionThread extends Thread{
    private final BankAccount b;
    private int withdraw;
    private int deposit;

    public TransactionThread(BankAccount b, int withdraw, int deposit){
        this.b=b;
        this.withdraw=withdraw;
        this.deposit=deposit;
    }

    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            b.deposit(deposit);
            b.withdraw(withdraw);
        }
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
}
