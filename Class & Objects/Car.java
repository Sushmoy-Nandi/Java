public class Car {

    static int noOfCarsSold;

    // instance variable
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    static{
        noOfCarsSold =0;
        System.out.println("I am Static Block");

    }

    {
        noOfCarsSold++;
        System.out.println("I am Init Block");
    }



    Car(String color){
        noOfWheels=4;
        this.color=color;
        maxSpeed=150;
        currentFuelInLiters=2;
        noOfSeats=5;
    }
    Car(){
        this("Black");
        currentFuelInLiters =5;
    }
   

    public Car start(){
        if(currentFuelInLiters==0)
        {
            System.out.println("Car is out of fuel, can not stat");
        }
        else if(currentFuelInLiters<5){
            System.out.println("Car is in reserved mode,please refuel ");
            currentFuelInLiters--;
        }
        else{
            System.out.println("Car is sarted.. bruhhhh......");
            currentFuelInLiters--;
        }
        return this;      

    }

    // method

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
