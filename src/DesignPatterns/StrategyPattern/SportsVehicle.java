package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
