package specialproblem1;

public class Car extends Transport {
    @Override
    void start() {
        System.out.println("Car is starting.....");
    }

    @Override
    void stop() {
        System.out.println("Car is stopped.");
    }

    // Unique method for Car
    void playMusic() {
        System.out.println("Car is playing music.");
    }
}

