package bankPackage.employeePackage;

import bankPackage.accountPackage.FixedDeposit;
import bankPackage.accountPackage.Savings;
import bankPackage.accountPackage.Student;

public abstract class Employee {

    String name;

    Employee(String employeeName){
        name = employeeName;
    }
    public String getName(){
        return name;
    }
    public abstract boolean canApproveLoans();
    public abstract boolean canSeeInternalFunds();
    public abstract boolean canChangeInterestRate(String type, double newRate);
    public abstract boolean canLookUp();

}



