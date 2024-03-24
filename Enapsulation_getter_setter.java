interface Transaction {
    // int data=3;
    void deposit(double amount);
    void withdraw(double amount);
}
class logs{
    private long acc_no;
    private int phone;
    private float balance;
    private long IFSC_CODE;
  
}

class SavingsAccount  implements Transaction extends logs    {

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class CurrentAccount implements Transaction {
    private double balance;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Enapsulation_getter_setter {
    public static void main(String[] args) {
        Transaction savingsAccount = new SavingsAccount(1000.0);
        Transaction currentAccount = new CurrentAccount(2000.0);

        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        System.out.println("Savings Account Balance: $" + ((SavingsAccount) savingsAccount).getBalance());

        currentAccount.deposit(1000.0);
        currentAccount.withdraw(3000.0);
        System.out.println("Current Account Balance: $" + ((CurrentAccount) currentAccount).getBalance());
        
    }
}
