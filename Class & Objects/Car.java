public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    Car(){
        noOfWheels=4;
        color="Black";
        maxSpeed=150;
        currentFuelInLiters=2;
        noOfSeats=5;
    }

    public Car start(){
        if(currentFuelInLiters==0)
        {
            System.out.println("Car is out of fuel, can not stat");
        }
        else if(currentFuelInLiters<5){
            System.out.println("Car is in reserved mode,please refuel");
            currentFuelInLiters--;
        }
        else{
            System.out.println("Car is sarted.. bruhhhh......");
            currentFuelInLiters--;
        }
        return this;

    }

    public void drive(){
            System.out.println("Car is driving");
            currentFuelInLiters--;
    }

    public void addFuel(float fuel){
        currentFuelInLiters =currentFuelInLiters+fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }

    

}
