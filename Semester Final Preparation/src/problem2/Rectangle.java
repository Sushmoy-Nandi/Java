package problem2;

public class Rectangle extends Geometry {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    double volume() {
        return 0;
    }
}
