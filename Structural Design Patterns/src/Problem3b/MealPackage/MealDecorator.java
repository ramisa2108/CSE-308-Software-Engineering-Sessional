package Problem3b.MealPackage;

public abstract class MealDecorator implements Meal {

    protected Meal baseMeal;

    public MealDecorator(Meal baseMeal){
        this.baseMeal = baseMeal;
    }
    public void display(){
        baseMeal.display();
    }
    public double getCost(){
        return baseMeal.getCost();
    }

}
