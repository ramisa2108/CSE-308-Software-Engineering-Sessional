package bankPackage;

import bankPackage.accountPackage.Account;
import bankPackage.accountPackage.FixedDeposit;
import bankPackage.accountPackage.Savings;
import bankPackage.accountPackage.Student;
import bankPackage.employeePackage.Cashier;
import bankPackage.employeePackage.Employee;
import bankPackage.employeePackage.ManagingDirector;
import bankPackage.employeePackage.Officer;

import java.util.ArrayList;

public class Bank {

    private double internalFund;
    private ArrayList<Account> accounts;
    private ArrayList<Employee> employees;
    private ArrayList<Loan> pendingLoans;
    private Account currentAccount;
    private Employee currentEmployee;

    public Bank(){

        internalFund = 1000000.00;
        accounts = new ArrayList<>();
        employees = new ArrayList<>();
        pendingLoans = new ArrayList<>();
        currentAccount = null;
        currentEmployee = null;

        employees.add(new ManagingDirector("MD"));
        for(int i=1;i<=2;i++){
            employees.add(new Officer("S"+i));
        }
        for(int i=1;i<=5;i++){
            employees.add(new Cashier("C"+i));
        }

        System.out.println("Bank Created. MD, S1, S2, C1, C2, C3, C4, C5 created.");
    }

    public void createAccount(String name, String type, double amount){

        Account account = null;
        for(Account acc: accounts){

            if(acc.getName().equals(name)){
                System.out.println("Account under the same name exists.");
                return;
            }
        }

        if(type.equalsIgnoreCase("Student")){
            account = new Student(name, amount);
        }
        else if(type.equalsIgnoreCase("Savings")){
            account = new Savings(name, amount);
        }
        else if(type.equalsIgnoreCase("FixedDeposit")){

            if(amount < 100000.00){
                System.out.println("Minimum deposit should be 100,000$.");
            }
            else{
                account = new FixedDeposit(name, amount);
            }

        }
        else {
            System.out.println("Invalid account type.");
        }

        if(account != null){
            accounts.add(account);
            currentAccount = account;
        }

    }

    public void open(String name){

        currentEmployee = null;
        currentAccount = null;

        for(Employee emp:employees){

            if(emp.getName().equals(name)){
                System.out.println(name +" active.");
                if(pendingLoans.size() > 0 && !(emp instanceof Cashier)){
                    System.out.println("There are loan approvals pending.");
                }
                currentEmployee = emp;
                return ;
            }

        }
        for(Account acc:accounts){
            if(acc.getName().equals(name)){
                System.out.println("Welcome back, "+name+".");
                currentAccount = acc;
                return ;
            }
        }
        System.out.println("No such account.");

    }
    public void close(){

        if(currentAccount != null){
            System.out.println("Transaction closed for "+currentAccount.getName());
            currentAccount = null;
        }
        else if(currentEmployee != null){
            System.out.println("Operations closed for "+currentEmployee.getName());
            currentEmployee = null;
        }
    }

    public void deposit(double amount){
        currentAccount.deposit(amount);
    }

    public void withdraw(double amount){
        currentAccount.withdraw(amount);
    }

    public void query(){
        currentAccount.query();
    }

    public void requestLoan(double amount){
        if(currentAccount.loanRequestValid(amount)){
            addLoanRequest(currentAccount, amount);
        }
    }

    public void increment(){

        System.out.println("One year passed.");
        for(Account acc: accounts){

            double annualIncome = acc.annualIncomeInterest() - acc.annualCharges();
            acc.transferred(annualIncome);
            internalFund -= annualIncome;
            acc.increment();
        }

    }

    private void addLoanRequest(Account acc, double amount){
        Loan loan = new Loan(amount, acc);
        pendingLoans.add(loan);
    }

    public void approveLoans(){
        if(currentEmployee.canApproveLoans()){
            addLoansToAccount();
        }
        else{
            System.out.println("You don't have permission for this operation.");
        }
    }

    public void seeInternalFunds(){

        if(currentEmployee.canSeeInternalFunds()){
            System.out.println("Internal fund is "+internalFund + "$.");
        }
        else{
            System.out.println("You don't have permission for this operation.");
        }
    }

    private void addLoansToAccount(){

        for(Loan loan:pendingLoans){
            Account acc = loan.getBorrower();
            acc.addLoan(loan);
            internalFund -= loan.getAmount();
        }
        pendingLoans.clear();
    }

    public void changeInterestRate(String type, double newRate){
        if(currentEmployee.canChangeInterestRate(type, newRate)) {

            if (type.equalsIgnoreCase("Student")) {
                Student.setDepositInterest(newRate);
            } else if (type.equalsIgnoreCase("Savings")) {
                Savings.setDepositInterest(newRate);
            } else if (type.equalsIgnoreCase("FixedDeposit")) {
                FixedDeposit.setDepositInterest(newRate);
            } else {
                System.out.println("Invalid account type.");
                return;
            }
            System.out.println("Interest rate for " + type + " type account set to " + newRate + "%.");
        }
        else{
            System.out.println("You don't have permission for this operation.");
        }
    }

    public void lookUp(String name){

        if(currentEmployee.canLookUp()) {

            for (Account acc : accounts) {
                if (acc.getName().equals(name)) {
                    System.out.print(acc.getName() + "'s account: ");
                    acc.query();
                    return;
                }
            }
            System.out.println("No account under name " + name);
        }
        else{
            System.out.println("You don't have permission for this operation.");
        }
    }
}
