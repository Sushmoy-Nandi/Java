class Cylinder{
    public double radius;
    public double height;

    public double lidarea(){
        return Math.PI*radius*radius;
    }
     public double circumference(){
        return 2*Math.PI*radius;
    }

    public double totalsurgacearea(){
        return 2*lidarea()+circumference()*height;
    }

    public double volume(){
        return lidarea()*height;
    }
}

public class myCylinder {
    public static void main(String[] args) {
        Cylinder c= new Cylinder();
        c.radius=7;
        c.height=10;
        System.out.println("Area: "+c.lidarea());
        System.out.println("Total Area: "+c.totalsurgacearea());
        System.out.println("Volume: "+c.volume());
    }
}
