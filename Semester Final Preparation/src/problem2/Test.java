package problem2;

public class Test {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Rectangle Volume: " + rect.volume());

        Circle circle = new Circle(7);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Volume: " + circle.volume());
    }
}
