package multithreading;


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        synchronized (this) {  // Synchronized block
            double newBalance = balance + amount;
            balance = newBalance;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        synchronized (this) {  // Synchronized block
            if (balance >= amount) {
                double newBalance = balance - amount;
                balance = newBalance;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}

public class SynchronisedBlockUse {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100.0);
            }
        });

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(200.0);
            }
        });

        depositThread.start();
        withdrawThread.start();

        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}
