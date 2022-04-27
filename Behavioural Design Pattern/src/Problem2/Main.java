package Problem2;


import Problem2.MediatorPackage.ServiceMediator;
import Problem2.ServicePackage.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ServiceMediator serviceMediator = new ServiceMediator();
        ArrayList<ServiceProvider> allServices = new ArrayList<>();

        allServices.add(new JWSA(serviceMediator));
        allServices.add(new JTRC(serviceMediator));
        allServices.add(new JRTA(serviceMediator));
        allServices.add(new JPDC(serviceMediator));

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){

            String [] input = scanner.nextLine().split(" ");
            String orgName = input[0];
            String serviceName = input[1];


            for(ServiceProvider serviceProvider : allServices){

                if(serviceProvider.getOrganizationName().equalsIgnoreCase(orgName)){

                    if(serviceName.equalsIgnoreCase("Serve")){
                        serviceProvider.provideService();
                    }
                    else{
                        serviceProvider.requestService(serviceName);
                    }
                    break;
                }
            }
        }

    }
}
