package ss14_sort_algorithm.insertion_sort_algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class InsertSortAlgorithm {
    public static void main(String[] args) {
        /**
         * @creator: Lâm Gunner
         */
        Scanner scanner = new Scanner(System.in);
        // Nhập vào độ dài của mảng mà bạn muốn thêm vào
        System.out.print("Nhập vào độ dài của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            // Nhập vào phần tủ
            System.out.print("Nhập giá trị của phần tử thứ " + i + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        // Hiển thị phần tử vừa thêm vào
        System.out.println("Mảng sau khi thêm vào là: " + Arrays.toString(array));
        // Giả sử ta có 1 mảng sẵn array = [3,2,6,7,1,5];
        int pos; // vị trí phần tử ở trong mảng
        int x; //  giá trị của phần tử
        for (int i = 1; i < array.length; i++) { // Chạy vòng lặp ngoài
            x = array[i]; // vòng 1 : array[i] = 2, tăng i lên và tiếp tục vòng lặp;
            pos = i; // vòng 1: pos = 1, vị trí được thay đổi;
            while (pos > 0 && x < array[pos - 1]) { // Chạy vòng lặp trong
                array[pos] = array[pos - 1]; // Nếu thỏa mãn điều kiện array[pos] được gán bằng giá trị ở trước nó array[pos-1];
                pos--; //  chạy đến khi pos < 0 thì dừng vòng lặp;
            }
            array[pos] = x; // vòng 1: pos = 0 , x = 2, gán giá trị x về vị trí chèn vào;
        }
        System.out.print("Mảng sau khi sắp xếp: " + Arrays.toString(array));
    }
}
