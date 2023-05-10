package ss3_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1= new int[2];
        int[] array2 = new int[3];
        int length = array1.length+array2.length;
        int[] array3= new int[length];

        for (int i =0; i < array1.length; i++) {
            System.out.print("Nhập phần tử thứ "+i+" của mảng thứ 1: ");
            array1[i]=Integer.parseInt(scanner.nextLine());
            array3[i]=array1[i];

        }

        System.out.print("Phần tử của mảng 3 sau khi thêm mảng 1 vào");
        System.out.println(Arrays.toString(array3));
        for (int j = array3[array2.length]; j <array3.length-1; j++) {
            System.out.println("Nhập phần tử thứ "+j+" của mảng thứ 2: ");
            array2[j]=Integer.parseInt(scanner.nextLine());
            array3[j]=array2[j];
        }
        System.out.println("Phần tử của mảng 3 sau khi thêm mảng 2 vào");
        System.out.println(Arrays.toString(array3));

    }
}
