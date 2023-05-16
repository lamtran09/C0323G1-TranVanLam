package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Rectangle implements Resizeable {
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    /**
     *
     * @return kết quả của diện tích hình chữ nhật
     * @creator: Lam
     */
    public double getArea() {
        return (this.length * this.width);
    }
    /**
     * resize là kích thước phần tăng lên
     * @param percent phần trăm mà người dùng nhập vào
     * @creator: Lam
     */
    @Override
    public void resize(double percent) {
        double resize = (getArea()*percent/100);
        System.out.println("Kích thước được tăng lên là: " + resize);
        System.out.println("Diện tích ban đầu: " + getArea() + ", " + "Diện tích sau khi tăng kích thước: " + (getArea() + resize));
    }
}
