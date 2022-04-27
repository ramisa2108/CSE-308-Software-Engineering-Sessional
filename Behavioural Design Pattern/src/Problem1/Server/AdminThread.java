package Problem1.Server;

import Problem1.Server.SubjectPackage.Stock;
import Problem1.Server.SubjectPackage.StockList;

import java.util.Scanner;

public class AdminThread implements Runnable{

    private final Scanner scanner;
    private final StockList stockList;

    public AdminThread(StockList stockList){
        this.stockList = stockList;
        this.scanner = new Scanner(System.in);
    }
    public void run(){

        while(scanner.hasNextLine()){

            String command = scanner.nextLine();

            try {
                String [] commandParts = command.split(" ");
                Stock stock = stockList.getStock(commandParts[1]);

                if(commandParts[0].equalsIgnoreCase("I")){
                    stock.increasePrice(Double.parseDouble(commandParts[2]));
                }
                else if(commandParts[0].equalsIgnoreCase("D")){
                    stock.decreasePrice(Double.parseDouble(commandParts[2]));
                }
                else if(commandParts[0].equalsIgnoreCase("C")){
                    stock.changeCount(Integer.parseInt(commandParts[2]));
                }
                else{
                    System.out.println("Invalid Command.");
                }

            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

}
