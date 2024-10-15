package assignment2.pizza;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza margheritaPizza = new MargheritaPizza();
        System.out.println(margheritaPizza.getDescription() + " Cost: " + margheritaPizza.getCost());

        Pizza margheritaWithCheeseAndMushrooms = new MushroomTopping(new CheeseTopping(margheritaPizza));
        System.out.println(margheritaWithCheeseAndMushrooms.getDescription() + " Cost: " + margheritaWithCheeseAndMushrooms.getCost());
        
        Pizza vegetarianPizza = new VegetarianPizza();
        Pizza veggieWithPepperoniAndCheese = new CheeseTopping(new PepperoniTopping(vegetarianPizza));
        System.out.println(veggieWithPepperoniAndCheese.getDescription() + " Cost: " + veggieWithPepperoniAndCheese.getCost());
    }
}

