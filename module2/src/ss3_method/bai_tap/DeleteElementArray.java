package ss3_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int size;
        int[] array;
        System.out.println("Nhập vào độ dài của mảng!!!");
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng bạn mới nhập vào là: ");
        System.out.println(Arrays.toString(array));
        int number;
        System.out.println("Nhập vào số mà bạn muốn xóa trong mảng");
        number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                array[i] = 0;
                for (int j = index; j < array.length - 1; j++) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Vị trí của số bạn muốn xóa là " + index);
        System.out.println(Arrays.toString(array));
    }
}