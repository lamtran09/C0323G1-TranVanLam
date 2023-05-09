package ss2_array_and_loop.bai_tap;

import java.util.Scanner;

public class ShowFirstTwentyPrimes {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        int length;        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài số nguyên tố mà bạn muốn in ra");
        length = Integer.parseInt(scanner.nextLine());
        while (count < length) {
            if (isPrime(num)) {
                System.out.print(num + ",");
                count++;
            }
            num++;
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i < num - 1; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}








