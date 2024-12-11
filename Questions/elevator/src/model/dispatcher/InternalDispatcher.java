package model.dispatcher;

import model.Direction;
import model.ElevatorCar;
import model.ElevatorController;
import model.data.ElevatorCreator;
import util.Util;

import java.util.List;

public class InternalDispatcher {
    /**
     * Both ExternalDispatcher and InternalDispatcher will have same ElevatorController list so that they are synchronized
     */
    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitInternalRequest(int destinationFloor, ElevatorCar elevatorCar) {

        if (elevatorCar.getCurrentFloorNumber() == destinationFloor) {
            System.out.println("Elevator #" + elevatorCar.getId() + " is on the current floor");
            Util.FloorReachedMessage(destinationFloor);
            Util.createStarBreaker();
        }

        System.out.println("Elevator #" + elevatorCar.getId() + " in progress");

        int currentFloorNumber = elevatorCar.getCurrentFloorNumber();
        Direction direction = (currentFloorNumber - destinationFloor < 0) ? Direction.UP : Direction.DOWN;
        elevatorCar.move(destinationFloor, direction);

        Util.FloorReachedMessage(destinationFloor);
        Util.createStarBreaker();
    }
}