package in.kgcoding;

public class AccessTest {
    public static void main(String[] args) {
        Car car =new Car();
        car.color="Red";
        car.model="Swift";
        System.out.println(car);
       car.costOfPurchase=7654;
        Car newCar=new Car("Black","BMW",1,5000);
        System.out.println(newCar);

        Default def=new Default();

    }
}
