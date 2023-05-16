package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Circle implements Resizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return kết quả của diện tích hình tròn
     */
    public double getArea() {
        return (this.radius * this.radius) * 3.14;
    }


    @Override
    public String toString() {
        return "Circle{}" +
                "Area: " + getArea();
    }

    /**
     * resize là kích thước phần tăng lên
     * @param percent phần trăm mà người dùng nhập vào
     */
    @Override
    public void resize(double percent) {
        double resize = getArea() * percent / 100;
        System.out.println("Kích thước được tăng lên là: " + resize);
        System.out.println("Diện tích ban đầu: " + getArea() + ", " + "Diện tích sau khi tăng kích thước: " + (getArea() + resize));
    }
}
