package ss3_array_method;

import java.util.Arrays;
import java.util.Scanner;

public class FindInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayInteger = {1, 5, 6, 7, 8, 9, 9};
        int number;
        while (true) {
            System.out.println("Nhập một số nguyên: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Nhập sai định dạng");
            }
        }
        if (checkNumber(number, arrayInteger) == -1) {
            System.out.println("Không tồn tại số trong mảng");
            System.out.println("Mảng đó là " + Arrays.toString(arrayInteger));
        } else {
            System.out.println(checkNumber(number, arrayInteger));
        }
    }

    public static int checkNumber(int number, int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                index = i;
                return index;
            }
        }
        return -1;
    }
}
