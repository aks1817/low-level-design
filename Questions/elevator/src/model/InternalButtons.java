package model;

import model.dispatcher.InternalDispatcher;

public class InternalButtons {

    InternalDispatcher dispatcher = new InternalDispatcher();
    private int[] availableButtons = {-1, 0, 1, 2, 3, 4, 5};
    private int buttonSelected;

    void pressButton(int destinationFloor, ElevatorCar elevatorCar) {
        dispatcher.submitInternalRequest(destinationFloor, elevatorCar);
    }
}