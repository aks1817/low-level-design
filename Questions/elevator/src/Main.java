import model.Building;
import model.Direction;
import model.ElevatorCar;
import model.Floor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Floor floorNeg1 = new Floor(-1);
        Floor floor0 = new Floor(0);
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        Floor floor3 = new Floor(3);
        Floor floor4 = new Floor(4);

        Building building = new Building(Arrays.asList(floor1, floor2, floor3, floor4));

        floor1.pressButton(Direction.UP);
        floor3.pressButton(Direction.UP);
        floor4.pressButton(Direction.UP);
        floor2.pressButton(Direction.DOWN);
        floorNeg1.pressButton(Direction.DOWN);


    }
}