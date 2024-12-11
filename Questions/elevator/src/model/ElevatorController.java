package model;

import java.util.PriorityQueue;

public class ElevatorController {
    /**
     * the reason we require min queue for up and max queue for down floors
     * eg: you are at floor 2 want to go 0 so nearest would be 1
     * eg: you are at floor 2 want to go 4 so nearest would be 3
     */
    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    private ElevatorCar elevatorCar;

    public ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a, b) -> (b - a));
    }

    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }

    public void submitExternalRequest(int floor, Direction direction) {
        if (direction == Direction.DOWN) {
            downMaxPQ.add(floor);
        } else {
            upMinPQ.add(floor);
        }
    }

    public void submitInternalRequest(int floor) {

    }

    public void controlElevator() {
        while (true) {
            if (elevatorCar.getDirection() == Direction.UP) {
            }
        }
    }
}