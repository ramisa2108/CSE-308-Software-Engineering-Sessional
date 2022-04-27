package Problem1.Server.ObserverPackage;

import Problem1.Server.SubjectPackage.Stock;
import Problem1.Server.SubjectPackage.StockList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class StockObserverThread implements Observer, Runnable{

    private final Socket connection;
    private BufferedReader readFromClient;
    private PrintWriter writeToClient;
    private final StockList stockList;

    public StockObserverThread(Socket connection, StockList stockList){

        this.connection = connection;
        this.stockList = stockList;

        try{
            readFromClient = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            writeToClient = new PrintWriter(connection.getOutputStream(), true);

            for(Stock stock: stockList.getAllStocks()){
                writeToClient.println(stock);
            }

        }catch (Exception e){
            System.out.println("Connection error.");
        }
    }
    public void run(){

        while(!connection.isClosed()){

            String request;
            try{
                request = readFromClient.readLine();
                sendRequest(request);

            }catch (Exception e){
                stateUpdated(e.getMessage());
            }
        }
    }
    public void sendRequest(String request) throws Exception{

        Stock stock = stockList.getStock(request.split(" ")[1]);
        if(request.startsWith("S")){
            stock.subscribe(this);
        }
        else if(request.startsWith("U")){
            stock.unsubscribe(this);
        }
        else throw new Exception("Invalid request");
    }

    public boolean stateUpdated(String message){

        if(connection.isClosed()){
            return false;
        }
        else {
            writeToClient.println(message);
            return true;
        }
    }
}
