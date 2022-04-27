package bankPackage.employeePackage;


public class ManagingDirector extends Employee{

    public ManagingDirector(String name){
        super(name);
    }

    @Override
    public boolean canSeeInternalFunds(){
        return true;
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
    public boolean canChangeInterestRate(String type, double amount){
        return true;
    }
}