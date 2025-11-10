package Ekim30_enums_ıterators_lambda;

public enum CoffeeType {
    AMERICANO("Americano",100),
    LATTE("Latte",170),
    ESPRESSO("Espresso",130),
    MOCHA("Mocha",200);


    private final String coffeeName ;
    private final double coffeePrice;


    CoffeeType(String coffeeName, double coffeePrice) {
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public double getCoffeePrice() {
        return coffeePrice;
    }
}
