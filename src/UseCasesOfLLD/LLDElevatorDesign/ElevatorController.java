package UseCasesOfLLD.LLDElevatorDesign;

import java.util.PriorityQueue;

public class ElevatorController {
    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    ElevatorCar elevatorCar;

    public ElevatorController(ElevatorCar elevatorCar) {
        this.upMinPQ = new PriorityQueue<>();
        this.downMaxPQ = new PriorityQueue<>((a, b) -> b-a);
        this.elevatorCar = elevatorCar;
    }

    public void submitExternalRequest(int floorNumber, Direction direction) {
        if(direction == Direction.DOWN){
            downMaxPQ.offer(floorNumber);
            // when lift is going downward then we are inserting floor in queue in such a way
            // that a floor which has greater floorNumber values serves first.
            // or we can say greater floor number value stays at the top of queue
        }else{
            upMinPQ.offer(floorNumber);
            // when lift is going upward then we are insertion floor in queue in such a way
            // that a floor which has lesser floorNumber values server first.
            // or we can say lesser floor number value stays at the top of queue.
        }
    }
    public void submitInternalRequest(int floor){

    }
    public void controlElevator(){
        while(true){
            if(elevatorCar.elevatorDirection == Direction.UP){

            }
        }
    }
}
