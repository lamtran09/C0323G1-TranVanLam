package ss15_exception.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int edgeA;
        int edgeB;
        int edgeC;

        while (true) {
            do {
                System.out.print("Nhập giá trị cạnh a: ");
                try {
                    edgeA = Integer.parseInt(scanner.nextLine());
                    if (edgeA <= 0) {
                        throw new IllegalTriangleException("Nhập sai nhập lại");
                    }
                    break;
                } catch (IllegalTriangleException e) {
                    System.out.println(e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai format");
                }
            } while (true);
            do {
                System.out.print("Nhập giá trị cạnh b: ");
                try {
                    edgeB = Integer.parseInt(scanner.nextLine());
                    if (edgeB <= 0) {
                        throw new IllegalTriangleException("Nhập sai nhập lại");
                    }
                    break;
                } catch (IllegalTriangleException e) {
                    System.out.println(e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai Format");
                }
            } while (true);
            do {
                System.out.print("Nhập giá trị cạnh c: ");
                try {
                    edgeC = Integer.parseInt(scanner.nextLine());
                    if (edgeC <= 0) {
                        throw new IllegalTriangleException("Nhập sai nhập lại");
                    }
                    break;
                } catch (IllegalTriangleException e) {
                    System.out.println(e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai Format");
                }
            } while (true);

            try {
                triangle(edgeA, edgeB, edgeC);
                System.out.println("Đây là một tam giác");
                break;
            } catch (IllegalTriangleException triangleException) {
                System.out.println(triangleException.getMessage());
                System.out.println("Nhập sai nhập lại");
            }
        }
    }

    public static boolean triangle(int edgeA, int edgeB, int edgeC) throws IllegalTriangleException {
        if (edgeA + edgeB <= edgeC || edgeA + edgeC <= edgeB || edgeB + edgeC <= edgeA) {
            throw new IllegalTriangleException("Không hợp lệ, Không phải tam giác");
        }
        return true;
    }
}
