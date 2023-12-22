package DesignPatterns.StrategyPattern.Strategy;

public class XYZdriveStrategy  implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("xyz drive capability!!");
    }
}
