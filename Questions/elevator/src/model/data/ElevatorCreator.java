package model.data;

import model.ElevatorCar;
import model.ElevatorController;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {
    public static List<ElevatorController> elevatorControllerList = new ArrayList<>();

    static {
        ElevatorCar elevatorCar1 = new ElevatorCar(1);
        ElevatorController elevatorController1 = new ElevatorController(elevatorCar1);

        ElevatorCar elevatorCar2 = new ElevatorCar(2);
        ElevatorController elevatorController2 = new ElevatorController(elevatorCar2);

        elevatorCar2.pressButton(3);

        elevatorControllerList.add(elevatorController1);
        elevatorControllerList.add(elevatorController2);
    }
}