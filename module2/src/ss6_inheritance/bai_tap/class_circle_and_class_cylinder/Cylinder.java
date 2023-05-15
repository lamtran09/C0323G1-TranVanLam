package ss6_inheritance.bai_tap.class_circle_and_class_cylinder;

public class Cylinder extends Circle {
    protected double height;


    public Cylinder() {
    }

    public Cylinder(double radios,double height, String color) {
        this.radius = radios;
        this.height = height;
        this.color = color;
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
        return getArea(radius) * this.height;
    }


    public double getArea() {
        return 2*3.14*this.height*this.radius;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "V =" + getV() +
                ", Color='" + color + '\'' +
                ", Area= "+getArea()+
                '}';
    }
}
