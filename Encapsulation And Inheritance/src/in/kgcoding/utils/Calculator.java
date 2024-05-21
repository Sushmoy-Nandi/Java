package in.kgcoding.utils;

import in.kgcoding.geomerty.Circle;
import in.kgcoding.geomerty.Rectangle;

//import in.kgcoding.geomerty.*; not recommanded

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double cirArea=Math.PI * Math.pow(cir.radius,2);
        double rectArea= rect.breadth* rect.breadth;

        System.out.println("Area of the circle is: "+cirArea);
        System.out.println("Area of the rectangle is: "+rectArea);
    }

}
