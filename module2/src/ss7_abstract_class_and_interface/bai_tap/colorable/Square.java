package ss7_abstract_class_and_interface.bai_tap.colorable;

public class Square implements Colorable{
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
     * @creator: Lam
     */
    public double getArea() {
        return (this.edge * this.edge);
    }
    /**
     * @creator: Lam
     */
    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                ", area=" + getArea() +
                '}';
    }
}
