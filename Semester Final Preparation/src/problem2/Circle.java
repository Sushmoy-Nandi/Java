package problem2;

public class Circle extends Geometry {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*radius*radius;
    }

    @Override
    double volume() {
        return 0;
    }
}
