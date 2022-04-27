package bankPackage.employeePackage;

public class Officer extends Employee{

    public Officer(String name){
        super(name);
    }

    @Override
    public boolean canSeeInternalFunds(){
        return false;
    }

    @Override
    public boolean canApproveLoans(){
        return true;
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
