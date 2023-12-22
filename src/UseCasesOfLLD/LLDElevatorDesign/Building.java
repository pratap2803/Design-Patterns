package UseCasesOfLLD.LLDElevatorDesign;

import java.util.List;

public class Building {
    List<Floor> floorList;

    public Building(List<Floor> floorList) {
        this.floorList = floorList;
    }
    public void addFloors(Floor floor){
        floorList.add(floor);
    }
    public void removeFloors(Floor removefloor){
        floorList.remove(removefloor);
    }
    public List<Floor> getAllFloorList(){
        return floorList;
    }
}
