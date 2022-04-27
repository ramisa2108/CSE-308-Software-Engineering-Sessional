package Problem1.Server.SubjectPackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class StockList {

    private ArrayList<Stock> allStocks;

    public StockList(){
        allStocks = new ArrayList<>();
    }
    public void addStock(File stockFile) throws Exception{

        Scanner scanner = new Scanner(stockFile);
        while(scanner.hasNextLine()){
            String [] info = scanner.nextLine().split(" ");
            Stock stock = new Stock(info[0], Integer.parseInt(info[1]), Double.parseDouble(info[2]));
            allStocks.add(stock);
            System.out.println(stock);
        }

    }
    public ArrayList<Stock> getAllStocks(){
        return allStocks;
    }

    public Stock getStock(String name) throws Exception{
        for(Stock stock: allStocks){
            if(name.equalsIgnoreCase(stock.name)){
                return stock;
            }
        }
        throw new Exception("Invalid Stock Name");
    }




}
