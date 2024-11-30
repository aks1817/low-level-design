import Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObject;
    Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }
    //this is known as constructor injection
    public void drive() {
        driveObject.drive();
    }
}
