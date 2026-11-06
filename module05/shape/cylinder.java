package module05.shape;

public class cylinder extends shape {
    private double radius;
    private double height;

    public cylinder(double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * (getRadius() * getRadius()) * getHeight();
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + getRadius() + " and height " + getHeight();
    }
}