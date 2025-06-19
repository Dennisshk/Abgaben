package worksheet5.task3;

public class BankAccountSimulator {
    public static void main(String [] args) {
        BankAccount account = new BankAccount (1000);

        Thread t1= new TransactionThread(account,1,1);
        Thread t2 = new TransactionThread(account,1,1);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            System.out.println("Interupted");
        }

        System.out.println (" Final balance: " + account. getBalance ());
    }
}
