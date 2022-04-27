package Problem1.Server.SubjectPackage;

import Problem1.Server.ObserverPackage.Observer;

public interface Subject {

    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void notifySubscribers(String message);
}
