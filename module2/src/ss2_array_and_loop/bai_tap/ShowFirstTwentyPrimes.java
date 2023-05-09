package ss2_array_and_loop.bai_tap;

import java.util.Scanner;

public class ShowFirstTwentyPrimes {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài số nguyên tố mà bạn muốn in ra");
        a = Integer.parseInt(scanner.nextLine());
        while (count < a) {
            if (isPrime(n)) {
                System.out.print(n + ",");
                count++;
            }
            n++;
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}








