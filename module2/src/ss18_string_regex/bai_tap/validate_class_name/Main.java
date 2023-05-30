package ss18_string_regex.bai_tap.validate_class_name;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String className;
        System.out.println("Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P\n" +
                "Không chứa các ký tự đặc biệt\n" +
                "Theo sau ký tự bắt đầu là 4 ký tự số \n" +
                "Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K");
        do {
            System.out.print("Nhập tên lớp học: ");
            className = scanner.nextLine();
        } while (!Validate.validateCheckClassName(className));
        System.out.print("OK thành công!!!");
    }
}
