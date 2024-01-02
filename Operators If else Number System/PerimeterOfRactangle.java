import java.util.Scanner;

public class PerimeterOfRactangle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            int d=input.nextInt();

            int perimeter=a+b+c+d;

            System.out.println("Perimeter: " + perimeter);
        }
    }
}
