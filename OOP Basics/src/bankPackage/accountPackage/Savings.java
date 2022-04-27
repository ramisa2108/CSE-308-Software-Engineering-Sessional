package bankPackage.accountPackage;

public class Savings extends Account{

    private static double savingsDepositInterest = 0.10;
    private static double savingsMaxLoan = 10000.00;


    public Savings(String accountName, double initialBalance){
        super(accountName, initialBalance);
        System.out.println("Savings account created for "+name+". Initial balance "+initialBalance+"$.");

    }
    @Override
    public void withdraw(double amount){
        if(getBalance() - amount < 1000.0){
            System.out.println("Invalid transaction. Withdrawal will leave less than 1000$ balance. Current balance "+getBalance()+"$.");
        }
        else{
            super.withdraw(amount);
        }
    }
    @Override
    double getDepositInterest(){
        return savingsDepositInterest;
    }
    @Override
    double getMaxLoanAmount(){
        return savingsMaxLoan;
    }
    public static void setDepositInterest(double newRate){
        savingsDepositInterest = newRate / 100.0;
    }

    @Override
    public double annualCharges(){
        double totalCharge = super.annualCharges();
        totalCharge += 500.0;
        return totalCharge;
    }
}

