package Problem3b.MealPackage;

public class Coke extends Drink{

    public Coke(Meal baseMeal){
        super(baseMeal);
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Coke");
    }
    @Override
    public double getCost(){
        return super.getCost() + 30.00;
    }

}
