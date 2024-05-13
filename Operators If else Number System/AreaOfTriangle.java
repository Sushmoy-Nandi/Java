import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find area triangle calculator");

        System.out.print("Please Enter the base of Triangle in cms: ");
        double base = input.nextDouble();

        System.out.print("Please Enter the Height of Triangle in cms: ");

        double height = input.nextDouble();

        double area= (0.5)*base*height;

        System.out.println("Area of Triangle: "+area +" cms^2");
    }
    
}
