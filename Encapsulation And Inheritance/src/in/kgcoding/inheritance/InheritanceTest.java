package in.kgcoding.inheritance;

import in.kgcoding.TwoWheeler;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle =new Vehicle();
        vehicle.commute();

        TwoWheeler two =new TwoWheeler();
        two.commute();
        two.balance();

        MotorCycle motorCycle= new MotorCycle();
        motorCycle.commute();
        motorCycle.balance();
        motorCycle.start();
    }
}
