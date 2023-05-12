package ss5_access_modifier_static.bai_tap.access_modifier;

public class Circle {
    private double radios = 1.0;
    private String color = "Red";

    public Circle() {

    }

    public Circle(double radios) {
        this.radios = radios;
    }

    public double getRadios() {
        return radios;
    }

    public void setRadios(double radios) {
        this.radios = radios;
    }

    public double getArea() {
        return this.radios * this.radios * 3.14;
    }
    // access modifier (private) là thành phần của lớp
//    private double getArea() {
//        return this.radios*this.radios*3.14;
//    }

    public void setColor(String color) {
        this.color = color;
    }
}