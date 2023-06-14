package ss2_loop;

import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số thứ nhất: ");
        int numberOne = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập vào số thứ hai: ");
        int numberTwo = Integer.parseInt(scanner.nextLine());
        // bội chung nhỏ nhất
        float leastCommonMultiple = 0;
        // ước chung nhỏ nhất
        float greatestCommonDivisor = 0;
        for (int i = 1; i < numberOne; i++) {
            for (int j = 1; j < numberTwo; j++) {
                if (numberOne % i == 0 && numberTwo % i == 0) {
                    greatestCommonDivisor = i;
                    break;
                }
            }
        }
        for (int i = 1; i <= numberOne * numberTwo;) {
            if (i % numberOne == 0 && i % numberTwo == 0) {
                leastCommonMultiple = i;
                break;
            }else {
                i++;
            }
        }
        System.out.println("Ước chung lớn nhất: " + greatestCommonDivisor);
        System.out.println("Bội chung nhỏ nhất: " + leastCommonMultiple);
        float avg = (greatestCommonDivisor + leastCommonMultiple) / 2;
        System.out.println("Trung bình cộng của ước chung lớn nhất và bội chung nhỏ nhất là: " + avg);
    }
}


