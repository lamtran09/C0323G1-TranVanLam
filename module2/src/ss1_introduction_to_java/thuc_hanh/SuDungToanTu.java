package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        // Nhập chiều rộng
        System.out.println("Enter Width: ");
        width = scanner.nextFloat();
        // Nhập chiều dài
        System.out.println("Enter Height: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
