package bankPackage.accountPackage;

public class FixedDeposit extends Account{

    private static double fixedDepositInterest = 0.15;
    private static double fixedDepositMaxLoan = 100000.00;

    public FixedDeposit(String accountName, double initialBalance){
        super(accountName, initialBalance);
        System.out.println("Fixed deposit account created for "+name+". Initial balance "+initialBalance+"$.");

    }
    @Override
    public void deposit(double amount){

        if(amount < 50000.00){
            System.out.println("Minimum deposit amount 50,000$.");
        }
        else{
            super.deposit(amount);
        }
    }
    @Override
    public void withdraw(double amount){
        if(getYears() == 0){
            System.out.println("Invalid transaction. Account hasn't reached maturity period of 1 year." +
                    " Current balance "+getBalance()+"$.");
        }
        else{
            super.withdraw(amount);
        }
    }

    @Override
    double getDepositInterest(){
        return fixedDepositInterest;
    }

    @Override
    double getMaxLoanAmount(){
        return fixedDepositMaxLoan;
    }

    public static void setDepositInterest(double newRate){
        fixedDepositInterest = newRate/100.0;
    }

    @Override
    public double annualCharges(){
        double totalCharge = super.annualCharges();
        totalCharge += 500.0;
        return totalCharge;
    }
}
