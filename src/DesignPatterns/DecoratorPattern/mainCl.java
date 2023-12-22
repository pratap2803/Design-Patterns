package DesignPatterns.DecoratorPattern;

public class mainCl {
    public static void mainClass(){
        BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));
        pizza.cost();
    }
}
