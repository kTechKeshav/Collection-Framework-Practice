package Assignments.assignment2;

import java.util.ArrayList;

class Bank{
    private ArrayList<Account> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }

    public void showAllBalances() {
        for (Account acc : accounts) {
            System.out.println("Account " + acc.getAccountNumber() + " Balance: " + acc.getBalance());
        }
    }

    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber))
                return acc;
        }
        return null;
    }
}

interface Account{
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    double getBalance();
    String getAccountNumber();
}

class SavingsAccount implements Account{
    private String accountNumber;
    private double balance;
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, double inititalAmount){
        this.accountNumber = accountNumber;
        balance = inititalAmount;
    }

    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public void calculateInterest() {
        System.out.println("\n Interest is => "+(balance*INTEREST_RATE));
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0){
            this.balance+=amount;
            System.out.println("\n "+amount+" deposited successfully.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount < this.balance && amount > 0){
            this.balance = this.balance - amount;
            System.out.println("\n "+amount+" withdraw successfully.");
        }
    }
}

class CurrentAccount implements Account{

    private String accountNumber;
    private double balance;
    private static final double OVERDRAFT_LIMIT = 1000.0;

    public CurrentAccount(String accountNumber, double initialAmount){
        this.accountNumber = accountNumber;
        this.balance = initialAmount;
    }

    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for current account");
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0)
            balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -OVERDRAFT_LIMIT)
            balance -= amount;
        else
            System.out.println("Overdraft limit exceeded in Current Account.");
    }
}

public class Ques_4 {
    public static void main(String[] args) {
        Bank SBI = new Bank();

        SavingsAccount savings = new SavingsAccount("S123", 5000);
        CurrentAccount current = new CurrentAccount("C456", 10000);

        SBI.addAccount(savings);
        SBI.addAccount(current);

        savings.deposit(2000);
        savings.calculateInterest();
        savings.withdraw(1000);

        current.withdraw(10500); // within overdraft
        current.withdraw(1000);  // exceeds overdraft
        current.calculateInterest();

        SBI.showAllBalances();
    }
}
