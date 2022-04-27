package Problem3b.MealPackage;

public class OnionRings extends Appetizer{

    public OnionRings(Meal baseMeal){
        super(baseMeal);
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Onion Rings.");
    }
    @Override
    public double getCost(){
        return super.getCost() + 100.00;
    }
}
