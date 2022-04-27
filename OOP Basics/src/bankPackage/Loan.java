package bankPackage;

import bankPackage.accountPackage.Account;

public class Loan {

    private double amount;
    private Account borrower;

    Loan(double loanAmount, Account loanBorrower){
        amount = loanAmount;
        borrower = loanBorrower;
    }

    public Account getBorrower(){
        return borrower;
    }
    public double getAmount(){
        return amount;
    }


}
