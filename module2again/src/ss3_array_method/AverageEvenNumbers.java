package ss3_array_method;

import java.util.Arrays;
import java.util.Scanner;

public class AverageEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        while (true) {
            System.out.print("Nhập số lượng mảng: ");
            try {
                size = Integer.parseInt(scanner.nextLine());
                if (size > 0) {
                    break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Sai định dạng, Vui lòng nhập số");
            }
        }

        int length;
        while (true) {
            System.out.print("Nhập độ dài của mảng: ");
            try {
                length = Integer.parseInt(scanner.nextLine());
                if (length > 0) {
                    break;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Sai định dạng, Vui lòng nhập số");
            }
        }

        int[][] twoDimensionalArray = new int[size][length];
        for (int i = 0; i < size; i++) {
            twoDimensionalArray[i] = new int[length];
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.print("Nhập giá trị phần tử thứ " + j + " mảng " + i + ": ");
                twoDimensionalArray[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(twoDimensionalArray));

        int sumArray = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < length; j++) {
                if (twoDimensionalArray[i][j] % 2 == 0) {
                    sumArray += twoDimensionalArray[i][j];
                    count++;
                }
            }
        }

        int averageEvenNumber = sumArray / count;
        System.out.println("Trung bình cộng số chẵn trong mảng là: " + averageEvenNumber);
    }
}
