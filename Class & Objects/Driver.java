public class Driver {

    public static void main(String[] args) {
        // Car myCar =new Car();
        // myCar.addFuel(6);
        // myCar.drive();
        // myCar.drive();
        // myCar.drive();
        
        // System.out.println(myCar.getCurrentFuelLevel());
        Car swift = new Car();
        //swift.addFuel(6);
        // Car startedCar = swift.start();
        // startedCar.drive();
        swift.start().drive();
        System.out.println(swift.color);
        System.out.println(swift.getCurrentFuelLevel());
    }
}
