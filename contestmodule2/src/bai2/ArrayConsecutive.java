package bai2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ArrayConsecutive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập độ dài của mảng(<200)");
            size = Integer.parseInt(scanner.nextLine());
        } while (size > 200 || size <= 0);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ "+i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int min=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max =arr[i];
            }
        }
        System.out.println("Giá trị min của mảng là: "+min);
        System.out.println("Giá trị max của mảng là: "+max);
        Set<Integer> integerSet = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< max && arr[i]>min){
                integerSet.add(arr[i]);
            }
        }
        System.out.println(integerSet);

    }
}
