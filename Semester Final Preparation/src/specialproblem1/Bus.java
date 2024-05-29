package specialproblem1;

public class Bus extends Transport {
    @Override
    void start() {
        System.out.println("Bus is starting....");
    }

    @Override
    void stop() {
        System.out.println("Bus is stopped.");
    }

    // Unique method for Bus
    void openDoors() {
        System.out.println("Bus is opening its doors.");
    }
}

