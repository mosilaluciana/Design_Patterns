package decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.getCost() + ", Description: " + simpleCoffee.getDescription());

        Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
        System.out.println("Cost: " + coffeeWithMilk.getCost() + ", Description: " + coffeeWithMilk.getDescription());

        Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println("Cost: " + coffeeWithMilkAndSugar.getCost() + ", Description: " + coffeeWithMilkAndSugar.getDescription());
    }
}
