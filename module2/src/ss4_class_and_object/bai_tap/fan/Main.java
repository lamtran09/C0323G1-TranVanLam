package ss4_class_and_object.bai_tap.fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius;
        String color;
        boolean on;
        int speed;
        Scanner scanner = new Scanner(System.in);
        Fan fan = new Fan();
        System.out.println("Mặc định: " + fan);
        System.out.println("Nhập tốc độ quạt: " +
                "1.Slow\n" +
                "2.Medium\n" +
                "3.Fast");
        speed = Integer.parseInt(scanner.nextLine());
        fan.setSpeed(speed);
        System.out.println("Bật/Tắt quạt: ");
        on = scanner.nextBoolean();
        fan.setOn(on);
        System.out.println("Màu sắc của quạt: ");
        color = scanner.nextLine();
        fan.setColor(color);
        System.out.println("Bán kính của quạt: ");
        radius = Integer.parseInt(scanner.nextLine());
        fan.setRadius(radius);
        Fan fan1 = new Fan(speed, on, color, radius);
        System.out.println("Thông số mà bạn vừa nhập cho quạt số 1: " + fan1);
    }
}