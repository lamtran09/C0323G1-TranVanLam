package ss6_inheritance.bai_tap.class_point_and_moveablepoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(4, 5, 6, 7);
        System.out.println(movablePoint);
        System.out.println(Arrays.toString(movablePoint.getXY()));
        System.out.println(movablePoint.move());
        Point point = new Point(4,5);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
