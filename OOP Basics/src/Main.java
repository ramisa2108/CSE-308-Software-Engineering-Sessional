import bankPackage.Bank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();


        while(scanner.hasNextLine()){

            String request = scanner.nextLine();
            String [] params = request.split(" ");

            try {

                if (params[0].equalsIgnoreCase("create")) {
                    bank.createAccount(params[1], params[2], Double.parseDouble(params[3]));
                }
                else if (params[0].equalsIgnoreCase("open")) {

                    bank.open(params[1]);

                }
                else if (params[0].equalsIgnoreCase("close")) {

                    bank.close();
                }
                else if (params[0].equalsIgnoreCase("deposit")) {

                    bank.deposit(Double.parseDouble(params[1]));

                }
                else if (params[0].equalsIgnoreCase("withdraw")) {

                    bank.withdraw(Double.parseDouble(params[1]));

                }
                else if (params[0].equalsIgnoreCase("query")) {

                    bank.query();
                }

                else if(params[0].equalsIgnoreCase("request")){
                    bank.requestLoan(Double.parseDouble(params[1]));
                }
                else if(params[0].equalsIgnoreCase("inc")){
                    bank.increment();
                }
                else if(params[0].equalsIgnoreCase("approve")){
                    bank.approveLoans();
                }
                else if(params[0].equalsIgnoreCase("see")){
                    bank.seeInternalFunds();
                }
                else if(params[0].equalsIgnoreCase("change")){
                    bank.changeInterestRate(params[1], Double.parseDouble(params[2]));
                }
                else if(params[0].equalsIgnoreCase("Lookup")){
                    bank.lookUp(params[1]);
                }


            }
            catch (Exception exp){
                System.out.println("Invalid operation.");
            }

        }

    }
}
