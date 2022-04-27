package Problem2.ServicePackage;

import Problem2.MediatorPackage.ServiceMediator;

public class JTRC implements ServiceProvider{

    private static String organizationName  = "JTRC";
    private static String serviceName = "TELECOM";
    private ServiceMediator serviceMediator;

    public JTRC(ServiceMediator serviceMediator){
        this.serviceMediator = serviceMediator;
        serviceMediator.addServiceProvider(this);
    }

    public String getServiceName(){
        return serviceName;
    }
    public String getOrganizationName(){
        return organizationName;
    }
    public void requestService(String serviceName){
        serviceMediator.request(this, serviceName);
    }
    public void provideService(){
        serviceMediator.provide(this);
    }
    public void notification(ServiceProvider provider){
        System.out.println(provider.getOrganizationName() + " serves the request of " + getOrganizationName());

    }
}
