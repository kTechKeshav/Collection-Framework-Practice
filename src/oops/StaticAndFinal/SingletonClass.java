package oops.StaticAndFinal;

class CoffeeMachine{
    private float coffeeQuantity;
    private float waterQuantity;

    static private CoffeeMachine our = null;

    private CoffeeMachine(){
        coffeeQuantity = 1.0f;
        waterQuantity = 2.0f;
    }

    public void fillWater(int waterQuantity){
        this.waterQuantity = waterQuantity;
    }

    public void fillCoffee(int coffeeQuantity){
        this.coffeeQuantity = coffeeQuantity;
    }

    static public CoffeeMachine getInstance(){
        if(our == null){
            our = new CoffeeMachine();
        }
        return our;
    }
}

public class SingletonClass {
//    ------------------------Singleton class is used to just create a single object------------------------------
public static void main(String[] args) {
    CoffeeMachine cm = CoffeeMachine.getInstance();
    cm.fillCoffee(39);
    cm.fillWater(94);
}
}
