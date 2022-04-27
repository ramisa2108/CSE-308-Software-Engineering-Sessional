package Problem2.MediatorPackage;

import Problem2.ServicePackage.ServiceProvider;

import java.util.*;

public class ServiceMediator implements Mediator {

    Map<ServiceProvider, Queue<ServiceProvider> >serviceQueue;
    Set<ServiceProvider> allServiceProviders;

    public ServiceMediator(){
        serviceQueue = new HashMap<>();
        allServiceProviders = new HashSet<>();
    }
    public void addServiceProvider(ServiceProvider serviceProvider){
        allServiceProviders.add(serviceProvider);
        serviceQueue.put(serviceProvider, new LinkedList<>());
    }

    public void request(ServiceProvider requester, String serviceName){

        for(ServiceProvider sp: allServiceProviders){
            if(sp.getServiceName().equalsIgnoreCase(serviceName)){
                serviceQueue.get(sp).add(requester);
                break;
            }
        }
        System.out.println(requester.getOrganizationName() + " requests for " + serviceName + " service");

    }
    public void provide(ServiceProvider provider){

        ServiceProvider nextToServe = serviceQueue.get(provider).poll();

        if(nextToServe != null){
            nextToServe.notification(provider);
        }
        else{
            System.out.println("No services requested.");
        }


    }

}
