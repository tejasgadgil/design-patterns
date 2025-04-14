//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}

abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public abstract void withdraw(double amount);

    public void displayBalance(){
        System.out.println("Account " + accountNumber + " Balance: " + balance);
    }
}

class SavingAccount extends BankAccount{
    private double interestRate;

    public SavingAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount){
        if( balance - amount >= 0){
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void applyInterest(){
        balance += balance * interestRate / 100;
        System.out.println("Interest applied. New balance: " + balance);
    }
}

class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if (balance - amount >= -overdraftLimit){
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

class BankAccountFactory{
    public static BankAccount createAccount(String type, String accountNumber, double balance, double extraParam){
        if (type.equalsIgnoreCase("savings")) {
            return new SavingAccount(accountNumber, balance, extraParam);
        } else if (type.equalsIgnoreCase("checking")) {
            return new CheckingAccount(accountNumber, balance, extraParam);
        } else {
            throw new IllegalArgumentException("Invalid account type");
        }
    }
}

public class Main {
    public static void main(String[] args) {
//        SavingAccount savings = new SavingAccount("SA123", 5000, 5);
//        CheckingAccount checking = new CheckingAccount("CA456", 2000, 1000);

        SavingAccount savings = (SavingAccount) BankAccountFactory.createAccount("savings", "SA123", 5000, 5);
        CheckingAccount checking = (CheckingAccount) BankAccountFactory.createAccount("checking", "CA456", 2000, 1000);

        savings.deposit(1000);
        savings.withdraw(2000);
        savings.applyInterest();
        savings.displayBalance();

        checking.deposit(500);
        checking.withdraw(3000);
        checking.displayBalance();
    }
}