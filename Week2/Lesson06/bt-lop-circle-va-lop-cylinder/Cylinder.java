public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * this.getHeight();
    }

    @Override
    public final String toString() {
        return "Cylinder{" + "radius=" + this.getRadius() + ", color=" + this.getColor() + ", area=" + this.getArea() + ", volume=" + this.getVolume() + '}';
    }
}
