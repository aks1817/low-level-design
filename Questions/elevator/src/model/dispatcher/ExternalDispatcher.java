package model.dispatcher;

import model.Direction;
import model.ElevatorCar;
import model.ElevatorController;
import model.data.ElevatorCreator;
import util.Util;

import java.util.List;

public class ExternalDispatcher {

    /**
     * Both ExternalDispatcher and InternalDispatcher will have same ElevatorController list so that they are synchronized
     */
    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitExternalRequest(int floor, Direction direction) {

        for (ElevatorController elevatorController : elevatorControllerList) {
            ElevatorCar elevatorCar = elevatorController.getElevatorCar();

            if (elevatorCar.getCurrentFloorNumber() == floor) {
                System.out.println("Elevator #" + elevatorCar.getId() + " is on the current floor");
                Util.FloorReachedMessage(floor);
                Util.createStarBreaker();
            } else if (floor % 2 == 0 && elevatorCar.getId() % 2 == 0) {
                System.out.println("Elevator #" + elevatorCar.getId() + " in progress");
                elevatorCar.move(floor, direction);
                Util.FloorReachedMessage(floor);
                Util.createStarBreaker();
            } else if (floor % 2 != 0 && elevatorCar.getId() % 2 == 1) {
                System.out.println("Elevator #" + elevatorCar.getId() + " in progress");
                elevatorCar.move(floor, direction);
                Util.FloorReachedMessage(floor);
                Util.createStarBreaker();
            }
        }
    }
}