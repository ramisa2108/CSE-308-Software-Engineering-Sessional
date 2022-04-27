package bankPackage.accountPackage;

import bankPackage.Loan;

import java.util.ArrayList;

public abstract class Account {

    String name;
    private double balance;
    private int years;
    private static double loanInterest = 0.10;
    private ArrayList<Loan> accountLoans;

    Account(String accountName, double initialBalance){

        name = accountName;
        balance = initialBalance;
        years = 0;
        accountLoans = new ArrayList<>();
    }

    public String getName(){
        return name;
    }


    double getBalance(){
        return balance;
    }

    int getYears(){
        return years;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println(amount + "$ deposited. Current balance "+balance+"$.");
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.print("Invalid transaction.");
        }
        else {
            balance -= amount;
            System.out.print(amount+"$ withdrawn from account.");
        }
        System.out.println("Current balance "+balance +"$.");
    }

    abstract double getDepositInterest();

    public void increment(){
        years += 1;
    }

    public double annualCharges(){
        double totalCharges = 0.0;
        for(Loan loan:accountLoans){
            totalCharges += loan.getAmount() * loanInterest;
        }
        return totalCharges;
    }

    public double annualIncomeInterest(){
        return balance * getDepositInterest();
    }

    public void transferred(double amount){
        balance += amount;
    }

    abstract double getMaxLoanAmount();

    public boolean loanRequestValid(double amount){

        double maxAmount = getMaxLoanAmount();
        if(amount > maxAmount){
            System.out.println("Maximum allowed loan for this account is "+maxAmount+"$.");
            return false;
        }
        else{

            System.out.println("Loan request successful, sent for approval.");
            return true;
        }

    }

    public void addLoan(Loan loan){
        accountLoans.add(loan);
        balance += loan.getAmount();
        System.out.println("Loan for "+name+" approved.");
    }

    private double calculateTotalLoan(){
        double totalLoan = 0.0;
        for(Loan loan:accountLoans){
            totalLoan += loan.getAmount();
        }
        return totalLoan;
    }

    public void query(){

        System.out.println("Current balance "+balance+"$.");
        if(accountLoans.size() > 0){
            System.out.println("Loan "+calculateTotalLoan()+"$.");
        }
    }





}

