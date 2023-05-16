package ss6_inheritance.bai_tap.class_circle_and_class_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getArea(double radius){
        return (this.radius *this.radius)*3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radios=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
