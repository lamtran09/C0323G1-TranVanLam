package ss6_inheritance;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    //Overload.
    public Cylinder(double darius, String color, double height) {
        super(darius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    //Override;
    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + this.height + "which is a subclass of" +
                super.toString();

    }
}

