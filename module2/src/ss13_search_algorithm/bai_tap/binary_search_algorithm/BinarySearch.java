package ss13_search_algorithm.bai_tap.binary_search_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        System.out.print("Nhập giá trị mà bạn muốn tìm kiếm: ");
        int value = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = arr.length - 1;
        System.out.print("Vị trí của giá trị bạn tìm kiếm ở trong mảng là: " + binarySearch(arr, left, right, value));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right < left) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (value == array[middle]) {
            return middle;
        } else if (value < array[middle]) {
            right = middle - 1;
            return binarySearch(array, left, right, value);
        } else {
            left = middle + 1;
            return binarySearch(array, left, right, value);
        }
    }
}
