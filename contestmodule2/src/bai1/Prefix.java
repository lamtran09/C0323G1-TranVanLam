package bai1;

import java.util.*;

public class Prefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        do {
            System.out.println("Nhập độ dài của mảng(1-100)");
            length = Integer.parseInt(scanner.nextLine());
        } while (length > 100 || length <= 0);

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ "+i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));

        int prefixSum = 0;
        Set<Integer> integerSet = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            prefixSum+=arr[i];
            integerSet.add(prefixSum);
        }

        System.out.println("Tổng của mảng a: " +prefixSum);
        System.out.println("Mảng b được tạo ra là "+integerSet);
    }
}
