package ss6_inheritance.thuc_hanh;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Shape shape = new Shape();

        Circle shape1;
        shape = (Circle) shape;
    }
}
