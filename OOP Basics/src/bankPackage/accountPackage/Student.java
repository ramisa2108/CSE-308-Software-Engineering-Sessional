package bankPackage.accountPackage;

public class Student extends Account{

    private static double studentDepositInterest = 0.05;

    private static double studentMaxLoan = 1000.00;


    public Student(String accountName, double initialBalance){
        super(accountName, initialBalance);
        System.out.println("Student account created for "+name+". Initial balance "+initialBalance+"$.");

    }

    @Override
    public void withdraw(double amount){
        if(amount > 10000.00){
            System.out.println("Invalid transaction. Can't withdraw more than 10,000$. Current balance "+getBalance()+"$.");
        }
        else{
            super.withdraw(amount);
        }
    }

    @Override
    double getDepositInterest(){
        return studentDepositInterest;
    }

    @Override
    double getMaxLoanAmount(){
        return studentMaxLoan;
    }


    public static void setDepositInterest(double newRate){
        studentDepositInterest = newRate/100.0;
    }

}
