package decorator;

class SimpleCoffee implements Coffee {
    public double getCost() {
        return 2.0;
    }

    public String getDescription() {
        return "Simple Coffee";
    }
}
