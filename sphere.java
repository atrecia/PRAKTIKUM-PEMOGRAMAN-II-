package module05.shape;

public class sphere extends shape {
    private double radius;

    public sphere(double radius) {
        super("Sphere");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * (getRadius() * getRadius());
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + getRadius();
    }
}