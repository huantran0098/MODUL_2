package baitap.circle;

public class Cylinder extends MyCircle {
    public double height ;

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
        return getHeight() * this.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                "color=" + getColor() +
                "height=" + height +
                '}';
    }
}
