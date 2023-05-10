package ss3_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[2];
        int[] array2 = new int[3];
        int length = array1.length + array2.length;
        int[] newArr = new int[length];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng thứ 1: ");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng thứ 1: " + Arrays.toString(array1));
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng thứ 2: ");
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng thứ 2: " + Arrays.toString(array2));
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            newArr[index] = array1[i];
            index++;
        }
        for (int i = 0; i < array2.length; i++) {
            newArr[index] = array2[i];
            index++;
        }
        System.out.println("Mảng sau khi gộp lại là " + Arrays.toString(newArr));
    }
}
