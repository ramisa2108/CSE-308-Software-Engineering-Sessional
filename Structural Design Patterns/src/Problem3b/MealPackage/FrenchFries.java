package Problem3b.MealPackage;

public class FrenchFries extends Appetizer{

    public FrenchFries(Meal baseMeal){
        super(baseMeal);
    }
    @Override
    public void display(){
        super.display();
        System.out.println("French Fries.");
    }
    @Override
    public double getCost(){
        return super.getCost() + 100.00;
    }

}
