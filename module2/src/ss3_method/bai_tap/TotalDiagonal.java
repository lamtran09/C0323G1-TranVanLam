package ss3_method.bai_tap;

import java.util.Scanner;

public class TotalDiagonal {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        int m;
        System.out.print("Nhập vào số lượng mảng: ");
        n = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào độ dài mảng: ");
        m = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[m];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập giá trị phần tử thứ " + j + " mảng " + i+": ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
        int tatolDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    tatolDiagonal += arr[i][j];
                }
            }
        }
        System.out.println("Tổng các số đường chéo chính của ma trận là: "+tatolDiagonal);
    }
}
