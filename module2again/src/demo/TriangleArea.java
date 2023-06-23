package demo;

public class TriangleArea extends Area {
    private int edgeD;

    public TriangleArea() {
    }

    public TriangleArea(int edgeA, int edgeB, int edgeD) {
        super(edgeA, edgeB);
        this.edgeD = edgeD;
    }

    public TriangleArea(int edgeA, int edgeB, int edgeC, int edgeD) {
        super(edgeA, edgeB, edgeC);
        this.edgeD = edgeD;
    }

    public int getEdgeD() {
        return edgeD;
    }

    public void setEdgeD(int edgeD) {
        this.edgeD = edgeD;
    }
    // Lớp con định nghĩa lại phương thưc toString ở lớp Cha, phương thức cùng tên cùng kiểu dữ liệu và cùng tham số
    @Override
    public String toString() {
        return "TriangleArea{" + super.toString()+
                "edgeD=" + edgeD +
                '}';
    }
}
