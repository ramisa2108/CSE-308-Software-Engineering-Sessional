package Problem3b.Client;

import Problem3b.MealPackage.Meal;

public class Main {
    public static void main(String[] args) {
        MealGetter mealGetter = new MealGetter();
        Meal meal = mealGetter.getMeal();
        System.out.println("Ordered Items:\n");
        meal.display();
        System.out.println("Total Cost = " + meal.getCost() + " Tk.");
    }
}
