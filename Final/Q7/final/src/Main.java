public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        BankAccount account = new BankAccount();

        for (int i = 1; i <= 4; i++) {
            Thread t = new Thread(new Transaction(account), "Deposit #" + i);
            t.start();
        }

        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new Transaction(account), "Withdraw #" + i);
            t.start();
        }
    }
}