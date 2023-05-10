package ss3_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int size;
        int[] array;
        System.out.println("Nhập vào độ dài của mảng: ");
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        int number;
        System.out.println("Nhập phần tử mà bạn muốn thêm vào mảng");
        number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        System.out.println("Bạn muốn thêm phần tử vào vị trí thứ: ");
        index = Integer.parseInt(scanner.nextLine());
        while (index <= -1&&index >= array.length){

        }
    }
}
