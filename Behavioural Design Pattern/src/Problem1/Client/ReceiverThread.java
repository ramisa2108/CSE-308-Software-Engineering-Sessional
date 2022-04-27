package Problem1.Client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread implements Runnable {
    private Socket connection;
    private BufferedReader readFromServer;

    public ReceiverThread(Socket connection){
        this.connection = connection;
        try {
            readFromServer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void run(){

        while(!connection.isClosed()){

            try{
                String response = readFromServer.readLine();
                System.out.println(response);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}
