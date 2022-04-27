package Problem3b.MealPackage;

public class Coffee extends Drink{
    public Coffee(Meal baseMeal){
        super(baseMeal);
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Coffee.");
    }
    @Override
    public double getCost(){
        return super.getCost() + 50.00;
    }
}
