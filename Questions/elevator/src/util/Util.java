package util;

public class Util {
    public static void createStarBreaker() {
        int i = 35;
        while (i != 0) {
            System.out.print("*");
            i--;
        }
        System.out.println();
        System.out.println();
    }

    public static void FloorReachedMessage(int destinationFloor) {
        System.out.println("Elevator reached floor " + destinationFloor);
    }

    public static void ElevatorFalseInputMessage() {
        System.out.println("Elevator cannot take the input. Kindly give correct floor number.");
        System.out.println();
    }
}