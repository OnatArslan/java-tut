package composition;

public class SmartKitchenParts {
    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchenParts(Refrigerator refrigerator, DishWasher dishWasher, CoffeeMaker coffeeMaker) {
        this.refrigerator = refrigerator;
        this.dishWasher = dishWasher;
        this.coffeeMaker = coffeeMaker;
    }

    public void addWater() {
        this.coffeeMaker.setToDo(true);
        System.out.println("Coffee is processing...");
    }

    public void pourMilk() {
    }

    public void loadDishWasher() {
        this.dishWasher.setHasWorkToDo(true);
        System.out.println("Dishes are washing...");
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        System.out.println("Food is ordering");
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        System.out.println("Washing dishes");
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        System.out.println("Brew coffee");
    }
}