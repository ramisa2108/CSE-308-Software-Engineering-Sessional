package Problem1.Server.SubjectPackage;

import Problem1.Server.ObserverPackage.Observer;

import java.util.ArrayList;

public class Stock implements Subject {

    public String name;
    private int count;
    private double price;
    private ArrayList<Observer> subscribers;


    public Stock(String name, int count, double price){
        this.name = name;
        this.count = count;
        this.price = price;
        this.subscribers = new ArrayList<>();
    }
    public void subscribe(Observer observer){
        if(!subscribers.contains(observer)){
            subscribers.add(observer);
        }

    }
    public void unsubscribe(Observer observer){
        if(subscribers.contains(observer)) {
            subscribers.remove(observer);
        }

    }
    public void increasePrice(double increase){
        this.price += increase;
        notifySubscribers("Stock " + name + " price increased to " + price + "$.");
    }
    public void decreasePrice(double decrease){
        this.price -= decrease;
        notifySubscribers("Stock " + name + " price decreased to " + price + "$.");
    }
    public void changeCount(int change){
        this.count += change;
        notifySubscribers("Stock " + name + " count is now " + count + ".");
    }
    public void notifySubscribers(String message){

        for(Observer observer : subscribers){
            if(!observer.stateUpdated(message)){
                subscribers.remove(observer);
            }
        }
    }

    @Override
    public String toString() {
        return name + ", no. of stocks = " + count + ", price = " + price + "$." ;
    }
}
