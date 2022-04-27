package Problem1.Server;

import Problem1.Server.ObserverPackage.StockObserverThread;
import Problem1.Server.SubjectPackage.StockList;

import java.io.File;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {


    public static void main(String[] args) {

        StockList stockList = new StockList();

        try{
            stockList.addStock(new File("src/Problem1/Server/StockList.txt"));
        }
        catch (Exception e){
            System.out.println("File error.");
        }

        AdminThread adminThread = new AdminThread(stockList);
        Thread threadMain = new Thread(adminThread);
        threadMain.start();


        try{
            ServerSocket serverSocket = new ServerSocket(5555);

            while(true){
                Socket connection = serverSocket.accept();
                StockObserverThread stockObserverThread = new StockObserverThread(connection, stockList);
                Thread thread = new Thread(stockObserverThread);
                thread.start();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
