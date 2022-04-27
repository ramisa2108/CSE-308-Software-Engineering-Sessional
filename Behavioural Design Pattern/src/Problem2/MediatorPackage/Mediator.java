package Problem2.MediatorPackage;

import Problem2.ServicePackage.ServiceProvider;

public interface Mediator {

    public void request(ServiceProvider serviceProvider, String serviceName);
    public void provide(ServiceProvider serviceProvider);

}
