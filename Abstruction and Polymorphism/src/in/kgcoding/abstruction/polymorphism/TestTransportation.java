package in.kgcoding.abstruction.polymorphism;

public class TestTransportation {

    public static void main(String[] args) {
        Car c = new Car();
        //Vehicle v= new Vehicle();
        Plane p = new Plane();

        //castTest(v);
        castTest(c);
        castTest(p);

        //Vehicle vCar = new Car();
        //Car cVehicle = (Car) new Vehicle();

    }
    private static void castTest(Vehicle veh){

        //Car cVehicle = (Car) veh;
        //((Car) veh).noOfDoors();
        //veh.noOfDoors();
        veh.start();
        //cVehicle.noOfDoors();

    }
}
