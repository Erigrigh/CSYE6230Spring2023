
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

    public class BankAccount {
        private int balance;
        private Lock lock;

        public BankAccount() {
            balance = 0;
            lock = new ReentrantLock();
        }

        public void deposit(int amount) {
            lock.lock();
            try {
                balance += amount;
                System.out.println("Deposited " + amount + ", balance is now " + balance);
            } finally {
                lock.unlock();
            }
        }

        public void withdraw(int amount) {
            lock.lock();
            try {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("Withdrawn " + amount + ", balance is now " + balance);
                } else {
                    System.out.println("Not enough balance to withdraw " + amount + ", balance is " + balance);
                }
            } finally {
                lock.unlock();
            }
        }
    }
