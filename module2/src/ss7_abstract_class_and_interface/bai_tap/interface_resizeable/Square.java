package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Square implements Resizeable {
    private int edge;

    public Square() {
    }

    public Square(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }
    /**
     *
     * @return kết quả của diện tích hình vuông
     */
    public double getArea() {
        return (this.edge * this.edge);
    }

    /**
     * resize là kích thước phần tăng lên
     * @param percent phần trăm mà người dùng nhập vào
     */
    @Override
    public void resize(double percent) {
        double resize = (getArea()*percent/100);
        System.out.println("Kích thước được tăng lên là: " + resize);
        System.out.println("Diện tích ban đầu: " + getArea() + ", " + "Diện tích sau khi tăng kích thước: " + (getArea() + resize));
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                "area=" + getArea() +
                '}';
    }
}
