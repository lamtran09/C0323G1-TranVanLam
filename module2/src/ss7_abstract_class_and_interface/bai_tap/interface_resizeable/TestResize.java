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
        int percent;
        double radius;
        int check;
        System.out.println("Menu \n" +
                "1.Circle (Hình Tròn)\n" +
                "2.Hinh Tam giác\n" +
                "3.Hình Vuông\n" +
                "4.Exit");
        do {
            System.out.print("Chọn hình: ");
            check = Integer.parseInt(scanner.nextLine());
            switch (check) {
                case 1:
                    while (true) {
                        System.out.print("Nhập vào giá trị của bán kính hình tròn: ");
                        radius = Double.parseDouble(scanner.nextLine());
                        if (radius > 0) {
                            Circle circle = new Circle(radius);
                            System.out.print("Nhập vào tỷ lệ phần trăm: ");
                            percent = Integer.parseInt(scanner.nextLine());
                            circle.resize(percent);
                        } else {
                            System.out.println("Nhập lại bạn nhé, Warning đừng làm tôi thất vọng!!! ");
                        }
                        break;
                    }
                case 2:
                case 3:
                case 4:
                    break;
                default:
                    System.out.println("Nhập sai !!! Nhập lại");
                    break;
            }
        } while (check != 4);
    }
}


