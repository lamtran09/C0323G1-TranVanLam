package ss3_method.bai_tap;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        int lengthRows;
        int lengthColumn;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng mảng: ");
        lengthRows = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào độ dài mảng: ");
        lengthColumn = Integer.parseInt(scanner.nextLine());
        double[][] numberArray = new double[lengthRows][lengthColumn];
        for (int i = 0; i < lengthRows; i++) {
            numberArray[i] = new double[lengthColumn];
            for (int j = 0; j < numberArray[i].length; j++) {
                System.out.print("Nhập giá trị phần tử thứ " + j + " mảng " + i+": ");
                numberArray[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < lengthRows; i++) {
            for (int j = 0; j < lengthColumn; j++) {
                System.out.print(numberArray[i][j] + ",");
            }
            System.out.println();
        }
        double sumColumn= 0;
        int indexColumn ;
        System.out.println("Nhập vào cột mà bạn muốn  tính tổng");
        indexColumn = scanner.nextInt();
        for (int i = 0; i < lengthColumn; i++) {
            sumColumn += numberArray[i][indexColumn];
        }
        System.out.println("Tổng các số ở một cột xác định là "+sumColumn);
    }
}