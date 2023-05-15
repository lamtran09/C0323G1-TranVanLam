package ss5_access_modifier_static.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }
    // access modifier (private) là thành phần của lớp
//    private double getArea() {
//        return this.radios*this.radios*3.14;
//    }

    public void setColor(String color) {
        this.color = color;
    }
}