public class Main {
    public static void main(String[] args) {
        Vehicle sportsVehicle=new SportsVehicle();
        sportsVehicle.drive();

        Vehicle normalVehicle=new GoodsVehicle();
        normalVehicle.drive();
    }
}