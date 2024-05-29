package specialproblem1;

import java.util.ArrayList;
import java.util.List;

public class TransportDemo {
    public static void main(String[] args) {
        // Create an array of Transport objects
        Transport[] vehicles = new Transport[3];

        // Populate the array with instances of Car, Bus, and Rickshaw
        vehicles[0] = new Car();
        vehicles[1] = new Bus();
        vehicles[2] = new Rickshaw();

        // Iterate through the array and demonstrate polymorphism
        for (Transport vehicle : vehicles) {
            vehicle.start(); // Call start method
            if (vehicle instanceof Car) {
                ((Car) vehicle).playMusic(); // Call unique method for Car
            } else if (vehicle instanceof Bus) {
                ((Bus) vehicle).openDoors(); // Call unique method for Bus
            } else if (vehicle instanceof Rickshaw) {
                ((Rickshaw) vehicle).honkHorn(); // Call unique method for Rickshaw
            }
            vehicle.stop(); // Call stop method
            System.out.println(); // Add a line break for clarity
        }
    }
}


