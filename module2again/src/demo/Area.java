package demo;

public class Area {
    private int edgeA;
    private int edgeB;
    private int edgeC;
// Contructor là một ví dụ  về Overload nó cùng tên với Class và có những phương thức khác tham số truyền vào
    public Area() {
    }

    public Area(int edgeA, int edgeB) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
    }

    public Area(int edgeA, int edgeB, int edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    public int getEdgeA() {
        return edgeA;
    }

    public void setEdgeA(int edgeA) {
        this.edgeA = edgeA;
    }

    public int getEdgeB() {
        return edgeB;
    }

    public void setEdgeB(int edgeB) {
        this.edgeB = edgeB;
    }

    public int getEdgeC() {
        return edgeC;
    }

    public void setEdgeC(int edgeC) {
        this.edgeC = edgeC;
    }

    @Override
    public String toString() {
        return "Area{" +
                "edgeA=" + edgeA +
                ", edgeB=" + edgeB +
                ", edgeC=" + edgeC +
                '}';
    }
}
