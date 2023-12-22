package UseCasesOfLLD.LLDElevatorDesign;

public class ElevatorDisplay {
    int floor;
    Direction direction;
    public void setDisplay(int currentFloor, Direction elevatorDirection) {
        this.floor = currentFloor;
        this.direction = elevatorDirection;
    }

    public void showDisplay() {
        System.out.println(floor);;
        System.out.println(direction);
    }
}
