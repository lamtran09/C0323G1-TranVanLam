package ss7_abstract_class_and_interface.bai_tap.interface_resizeable;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class TestResize {
    public static void main(String[] args) {
        /**
         * 1.Truy tìm được yêu cầu của bài toán
         * 2.Quét hết được trường hợp mà người dùng có thể nhập vào
         */
        Scanner scanner = new Scanner(System.in);
        // phần trăm
        int percent;
        double radius;
        // độ dài cạnh hình vuông
        double egde;
        int check;
        // chiều dài hình chữ nhật
        int length;
        // chiều rộng hình chữ nhật
        int width;
        do {
            System.out.println("Menu \n" +
                    "1.Circle (Hình Tròn)\n" +
                    "2.Hình chữ nhật\n" +
                    "3.Hình Vuông\n" +
                    "4.Exit");
            System.out.print("Chọn hình: ");
            check = Integer.parseInt(scanner.nextLine());
            switch (check) {
                case 1:
                    while (true) {
                        System.out.print("Nhập vào giá trị của bán kính hình tròn: ");
                        radius = Double.parseDouble(scanner.nextLine());
                        Circle circle = new Circle(radius);
                        System.out.println(circle);
                        if (radius > 0) {
                            System.out.print("Nhập vào tỷ lệ phần trăm: ");
                            percent = Integer.parseInt(scanner.nextLine());
                            circle.resize(percent);
                            System.out.println(circle);
                            break;
                        } else {
                            System.out.println("Nhập lại bạn nhé, Warning đừng làm tôi thất vọng!!! ");
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.print("Nhập vào giá trị cạnh của hình vuông: ");
                        egde = Double.parseDouble(scanner.nextLine());
                        if (egde > 0) {
                            Square square = new Square(egde);
                            System.out.println(square);
                            System.out.print("Nhập vào tỷ lệ phần trăm: ");
                            percent = Integer.parseInt(scanner.nextLine());
                            square.resize(percent);
                            System.out.println(square);
                            break;
                        } else {
                            System.out.println("Nhập lại bạn nhé, Warning đừng làm tôi thất vọng!!! ");
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.print("Nhập vào chiều dài hình chữ nhật: ");
                        length = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhập vào chiều rộng hình chữ nhật: ");
                        width = Integer.parseInt(scanner.nextLine());
                        Rectangle rectangle = new Rectangle(length, width);
                        if (length > width || (length > 0 && width > 0)) {
                            System.out.println(rectangle);
                            System.out.print("Nhập vào tỷ lệ phần trăm: ");
                            percent = Integer.parseInt(scanner.nextLine());
                            rectangle.resize(percent);
                            System.out.println(rectangle);
                            break;
                        } else {
                            System.out.println("Nhập lại bạn nhé, Warning đừng làm tôi thất vọng!!! ");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Tạm biệt nhé!!!");
                    break;
                default:
                    System.out.println("Nhập sai !!! Nhập lại");
                    break;
            }
        } while (check != 4);
    }
}