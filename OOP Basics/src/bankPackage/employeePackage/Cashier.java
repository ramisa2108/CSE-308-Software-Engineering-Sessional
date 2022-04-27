package bankPackage.employeePackage;

public class Cashier extends Employee{

    public Cashier(String name){
        super(name);
    }
    @Override
    public boolean canSeeInternalFunds(){
        return false;
    }

    @Override
    public boolean canApproveLoans(){
        return false;
    }

    @Override
    public boolean canLookUp(){
        return true;
    }

    @Override
    public boolean canChangeInterestRate(String type, double newRate){
        return false;
    }
}
