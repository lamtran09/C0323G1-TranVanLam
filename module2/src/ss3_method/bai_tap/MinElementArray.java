package ss3_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        System.out.print("Nhập vào độ dài của mảng: ");
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử vị trí thứ " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng sau khi thêm phần tử mới vào: ");
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[0] > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là " + min);
    }
}
