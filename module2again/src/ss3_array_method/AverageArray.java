package ss3_array_method;

import java.util.Arrays;
import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        while (true) {
            System.out.println("Nhập độ dài của mảng: ");
            try {
                length = Integer.parseInt(scanner.nextLine());
                if (length > 0) {
                    break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Nhập sai định dạng");
            }
        }

        int[] arrayNumber = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            arrayNumber[i] = Integer.parseInt(scanner.nextLine());
        }

        int[] arrayNumberOdd = new int[arrayNumber.length / 2];
        int index = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            if (i % 2 != 0) {
                arrayNumberOdd[index] = arrayNumber[i];
                index++;
            }
        }
        System.out.println("Các số ở vị trí lẻ trong mảng là: "+Arrays.toString(arrayNumberOdd));
        int sumArray = 0;
        for (int number : arrayNumberOdd) {
            sumArray += number;
        }

        // tính trung bình cộng
        System.out.println("Trung bình cộng các số nguyên ở vị trí lẻ trong mảng là " + average(sumArray,arrayNumberOdd.length));
    }
    public static int average(int sumArray,int length){
        return sumArray /length;
    }
}

