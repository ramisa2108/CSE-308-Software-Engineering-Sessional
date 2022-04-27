package Problem1.Client;


import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        try{

            Socket connection = new Socket("localhost", 5555);
            ReceiverThread receiverThread = new ReceiverThread(connection);
            Thread thread = new Thread(receiverThread);
            thread.start();

            PrintWriter writeToServer = new PrintWriter(connection.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNextLine()){
                String command = scanner.nextLine();
                writeToServer.println(command);
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }

}