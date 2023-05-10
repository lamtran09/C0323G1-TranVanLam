package ss3_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int size;
        int[] array;
        System.out.print("Nhập vào độ dài của mảng: ");
        size = Integer.parseInt(scanner.nextLine());
        array = new int[size+5];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        int number;
        System.out.print("Nhập phần tử mà bạn muốn chèn vào mảng: ");
        number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        System.out.print("Bạn muốn thêm phần tử vào vị trí thứ mấy của mảng: " );
        index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (index <= -1 ||index >= array.length-1) {
                System.out.println("Không chèn được phần tử vào mảng!!!");
                break;
            }else {
                int temp = array[index];
               array[index]=array[index+1];
                array[index+1]=number;
                number=temp;
            }

        }
        System.out.println("Bạn đã thêm "+number+" vào vị trí thứ "+index+" của mảng !!!");
        System.out.println(Arrays.toString(array));
    }
}
