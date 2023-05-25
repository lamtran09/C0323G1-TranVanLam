package ss15_exception.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cạnh a: ");
        int edgeA = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giá trị cạnh b: ");
        int edgeB = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giá trị cạnh c: ");
        int edgeC = Integer.parseInt(scanner.nextLine());
        try {
            triangle(edgeA, edgeB, edgeC);
        } catch (IllegalTriangleException triangleException) {
            System.out.println(triangleException.getMessage());
            System.out.println("Nhập lại");
        }
    }

    public static boolean triangle(int edgeA, int edgeB, int edgeC) throws IllegalTriangleException {
        if (edgeA < 0 || edgeB < 0 || edgeC < 0 || edgeA + edgeB <= edgeC || edgeA + edgeC <= edgeB || edgeB + edgeC <= edgeA) {
            throw new IllegalTriangleException("Không hợp lệ, Không phải tam giác");
        }
        return true;
    }
}