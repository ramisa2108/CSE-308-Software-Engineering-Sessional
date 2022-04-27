package Problem1.clientPackage;

import Problem1.builderPackage.FinalProduct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu:
        System.out.print("Select Package:\n" +
                "0.Silver (ATMega32 with load sensor)\n" +
                "1.Gold (Arduino with weight module)\n" +
                "2.Diamond (Raspberry Pi with load sensor\n" +
                "3.Platinum (Raspberry Pi with weight module.\n" +
                "Enter Choice Number: ");

        int packageNum = scanner.nextInt();

        System.out.print("Select Internet Module:\n" +
                "0.GSM Module\n" +
                "1.Wifi Module\n");

        if(packageNum >= 2){
            System.out.print("2.Ethernet Module\n");
        }
        System.out.print("Enter Choice Number: ");

        int internetNum = scanner.nextInt();

        System.out.print("Select Framework:\n" +
                "0.Django\n" +
                "1.Laravel\n" +
                "2.Spring\n" +
                "Enter Choice Number: ");
        int frameworkNum = scanner.nextInt();

        System.out.println("\n\n\n");

        Director director = new Director();

        try{
            FinalProduct finalProduct = director.construct(packageNum, internetNum, frameworkNum);
        }catch (Exception e){
            System.out.println("Invalid input.");
        }



    }
}
