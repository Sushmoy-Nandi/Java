public class Driver {
         static int minAgeForDriving=18;
   
        String name;
        String dateofLicense;

        int age;
        public boolean isAllowedToDrive(){
            return this.age >=minAgeForDriving;
        }

    

    public static void main(String[] args) {
        // Car myCar =new Car();
        // myCar.addFuel(6);
        // myCar.drive();
        // myCar.drive();
        // myCar.drive();
        
        // System.out.println(myCar.getCurrentFuelLevel());
        Car swift = new Car("Red");
        //swift.addFuel(6);
        // Car startedCar = swift.start();
        // startedCar.drive();
        swift.start().drive();
        System.out.println(swift.color);
        System.out.println(swift.getCurrentFuelLevel());

        Driver myDriver= new Driver();
        myDriver.dateofLicense="1/jun/2024";
        System.out.println(minAgeForDriving);
    }
}
