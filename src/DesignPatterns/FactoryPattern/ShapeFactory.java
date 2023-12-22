package DesignPatterns.FactoryPattern;

public class ShapeFactory {
    public Shape getShape(String input){
        switch(input){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
// this factorPattern is used when we want to create object on some condition.