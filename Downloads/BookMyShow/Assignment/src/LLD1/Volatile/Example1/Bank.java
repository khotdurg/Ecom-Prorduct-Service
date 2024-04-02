package LLD1.Volatile.Example1;

public class Bank {
    private volatile double balance = 0.0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Bank account = new Bank();
        Thread depositor = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100.0);
                sleep(1000);
            }
        });

        Thread balanceChecker = new Thread(() -> {
            while (true) {
                System.out.println("Current Balance: " + account.getBalance());
                sleep(2000);
            }
        });

        depositor.start();
        balanceChecker.start();
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
