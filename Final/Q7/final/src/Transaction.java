import java.util.Random;
public class Transaction implements Runnable{

    private static final int NUM_DEPOSIT_THREADS = 4;
    private static final int NUM_WITHDRAW_THREADS = 5;

    private BankAccount account;
    private Random rand;

    public Transaction(BankAccount account) {
        this.account = account;
        this.rand = new Random();
    }

    @Override
    public void run() {
        for (; ; ) {
            int amount = rand.nextInt(100);
            if (Thread.currentThread().getName().startsWith("Deposit")) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
