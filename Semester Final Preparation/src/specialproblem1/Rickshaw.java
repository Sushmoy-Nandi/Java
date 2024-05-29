package specialproblem1;

public class Rickshaw extends Transport {
    @Override
    void start() {
        System.out.println("Rickshaw is starting...");
    }

    @Override
    void stop() {
        System.out.println("Rickshaw is stopped.");
    }

    // Unique method for Rickshaw
    void honkHorn() {
        System.out.println("Rickshaw is honking.");
    }
}

