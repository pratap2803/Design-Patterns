package UseCasesOfLLD.LLDElevatorDesign;

import java.util.List;

public class ExternalDispatcher {
    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;
    public void submitExternalRequest(int floorNumber, Direction direction) {

        // for simplicity, i am following even odd,
        for(ElevatorController elevatorController : elevatorControllerList){
            int elevatorID = elevatorController.elevatorCar.id;
            if(elevatorID%2==1 && floorNumber%2==1){
                elevatorController.submitExternalRequest(floorNumber, direction);
            } else if (elevatorID%2==0 && floorNumber%2==0) {
                elevatorController.submitExternalRequest(floorNumber, direction);
            }
        }
    }
}
