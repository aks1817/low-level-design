package model;

import java.util.List;

public class Building {
    private List<Floor> floorList;

    public Building(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public void addFloors(Floor floor) {
        floorList.add(floor);
    }

    public void removeFloor(Floor floor) {
        floorList.remove(floor);
    }

    List<Floor> getAllFloorList() {
        return floorList;
    }
}
