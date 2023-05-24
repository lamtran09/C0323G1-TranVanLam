package ss14_sort_algorithm.setting_insertion_sort_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Setting_Insertion_Sort_Algorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + ": ");
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng sau khi được thêm vào: "+Arrays.toString(list));
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        int pos;
        int element ;
        for (int i = 1; i < list.length; i++) {
            pos = i;
            element = list[i];
            while (pos > 0 && element < list[pos - 1]) {
                list[i] = list[i - 1];
                pos--;
            }
            list[pos] = element;
        }
        System.out.println("Mảng sau khi được sắp xếp: "+Arrays.toString(list));
    }
}
