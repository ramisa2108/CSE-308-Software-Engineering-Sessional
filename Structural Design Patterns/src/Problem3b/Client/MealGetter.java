package Problem3b.Client;

import Problem3b.MealPackage.*;

import java.util.Scanner;


public class MealGetter {

    private Meal meal;
    private Scanner scanner;

    public MealGetter(){
        scanner = new Scanner(System.in);
    }

    public Meal getMeal(){
        choosePizza();
        chooseAppetizer();
        chooseDrink();
        return meal;
    }

    private void choosePizza(){
        System.out.println("Choose A Pizza:\n1. Beef Pizza: 250.00 Tk\n2. Veggie Pizza: 200.00 Tk");
        int choice = scanner.nextInt();
        if(choice == 1){
            meal = new BeefPizza();
        }
        else if(choice == 2){
            meal = new VeggiePizza();
        }
    }
    private void chooseAppetizer(){

        System.out.println("Choose An Appetizer:\n0. None\n1. French Fries: 100.00 Tk\n2. Onion Rings: 100.00 Tk");
        int choice = scanner.nextInt();
        if(choice == 1){
            meal = new FrenchFries(meal);
        }
        else if(choice == 2){
            meal = new OnionRings(meal);
        }
    }
    private void chooseDrink(){
        System.out.println("Choose A Drink:\n0. None\n1. Coffee: 50.00 Tk\n2. Coke: 30.00 Tk");
        int choice = scanner.nextInt();
        if(choice == 1){
            meal = new Coffee(meal);
        }
        else if(choice == 2){
            meal = new Coke(meal);
        }
    }

}
