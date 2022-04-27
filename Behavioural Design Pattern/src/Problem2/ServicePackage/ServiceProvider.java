package Problem2.ServicePackage;

public interface ServiceProvider {

    public String getServiceName();
    public String getOrganizationName();
    public void requestService(String serviceName);
    public void provideService();
    public void notification(ServiceProvider serviceProvider);

}
