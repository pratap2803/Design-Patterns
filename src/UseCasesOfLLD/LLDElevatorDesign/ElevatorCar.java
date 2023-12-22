package UseCasesOfLLD.LLDElevatorDesign;

import DesignPatterns.StrategyPattern.Strategy.DriveStrategy;

public class ElevatorCar {
    int id;
    ElevatorDisplay display;
    InternalButtons internalButtons;
    ElevatorState elevatorState;
    int currentFloor;
    Direction elevatorDirection;
    ElevatorDoor elevatorDoor;
    public ElevatorCar(){
        display = new ElevatorDisplay();
        internalButtons = new InternalButtons();
        elevatorState = ElevatorState.IDLE;
        currentFloor = 0;
        elevatorDirection = Direction.UP;
        elevatorDoor = new ElevatorDoor();
    }
    public void showDisplay(){
        display.showDisplay();
    }
    public void pressButton(int destination){
        internalButtons.pressButton(destination, this);
    }
    public void setDisplay(){
        this.display.setDisplay(currentFloor, elevatorDirection);
    }
    boolean moveElevator(Direction dir, int destinationFoor){
        int startFloor = currentFloor;
        if(dir == Direction.UP){
            for(int i = startFloor; i<= destinationFoor; i++){
                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFoor){
                    return true;
                }
            }
        }
        if(dir == Direction.DOWN){
            for(int i = startFloor; i>= destinationFoor; i--){
                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i==destinationFoor){
                    return true;
                }
            }
        }
        return false;
    }
}
