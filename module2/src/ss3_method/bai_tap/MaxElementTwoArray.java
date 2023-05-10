package ss3_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElementTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int size1;
        System.out.print("Nhập vào số lượng mảng: ");
        size = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào độ dài mảng: ");
        size1 = Integer.parseInt(scanner.nextLine());
        int[][] number = new int[size][size1];
        for (int i = 0; i <size ; i++) {
            number[i]= new int[size1];
            for (int j = 0; j < number[i].length; j++) {
                System.out.println("Nhập giá trị phần tử thứ "+j+" mảng "+i);
               number[i][j]= Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.print(number[i][j]+",");
            }
            System.out.println();
        }
        int max = number[0][0];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if(max<number[i][j]){
                    max = number[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng 2 chiều là: "+max);
    }
}
