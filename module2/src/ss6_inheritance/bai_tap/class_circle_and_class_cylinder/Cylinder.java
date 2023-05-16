package ss6_inheritance.bai_tap.class_circle_and_class_cylinder;

public class Cylinder extends Circle {
    private double height;


    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double radios, String color, double height, double v) {
        super(radios, color);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getV() {
        return getArea() * this.height;
    }


    public double getArea() {
        return 2*3.14*this.height*getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "V =" + getV() +
                ", Color='" + getColor() + '\'' +
                ", Area= "+getArea()+
                '}';
    }
}
