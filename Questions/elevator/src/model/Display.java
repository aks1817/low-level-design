package model;

public class Display {
    private int floor;
    private Direction direction;

    public void setDisplay(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public void getDisplay() {
        System.out.println("Current Floor: " + floor);
        System.out.println("Moving " + direction);
    }
}
