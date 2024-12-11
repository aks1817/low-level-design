package model;

import util.Util;

public class ElevatorCar {
    private Direction direction;
    private int id;
    private Display display;
    private int currentFloorNumber;
    private InternalButtons internalButtons;
    private Status status;

    public ElevatorCar(int id) {
        this.id = id;
        currentFloorNumber = 0; // considering it to be at ground floor
        direction = Direction.UP; // and will mostly be called by Upper floors
        display = new Display();
        status = Status.IDLE;
        internalButtons = new InternalButtons();
    }

    public void showDisplay() {
        display.getDisplay();
    }

    public void pressButton(int destinationFloor) {
        if (this.getId() % 2 == 0 && destinationFloor % 2 == 0) {
            internalButtons.pressButton(destinationFloor, this);
        }
        else if (this.getId() % 2 != 0 && destinationFloor % 2 != 0) {
            internalButtons.pressButton(destinationFloor, this);
        }
        else{
            Util.ElevatorFalseInputMessage();
        }
    }

    public void setDisplay() {
        display.setDisplay(currentFloorNumber, direction);
    }

    public int getId() {
        return id;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getCurrentFloorNumber() {
        return currentFloorNumber;
    }

    public void move(int destinationFloor, Direction direction) {
        int startFloor = currentFloorNumber;

        if (direction == Direction.UP) {
            this.direction = direction;
            status = Status.MOVING;
            for (int i = startFloor; i <= destinationFloor; i++) {
                this.currentFloorNumber = i;
                setDisplay();
                showDisplay();

            }
        }

        if (direction == Direction.DOWN) {
            this.direction = direction;
            status = Status.MOVING;
            for (int i = startFloor; i >= destinationFloor; i--) {

                this.currentFloorNumber = i;
                setDisplay();
                showDisplay();

            }
        }
    }
}