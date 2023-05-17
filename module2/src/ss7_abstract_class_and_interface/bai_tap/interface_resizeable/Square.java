package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

public class Square implements Resizeable {
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
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
        setEdge(getEdge()+getEdge()*(percent/100));
    }
    @Override
    public String toString() {
        return "Square{" +
                "Edge= " + edge +
                ",Area= " + getArea() +
                '}';
    }
}
