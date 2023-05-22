package ss11_dsa_stack_queue.bai_tap.convert_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Nhập số cần đổi qua hệ nhị phân: ");
        number = Integer.parseInt(scanner.nextLine());
        while ((number != 0)) {
            int binary = number % 2;
            integerStack.push(binary);
            number /= 2;
        }
        System.out.println(integerStack);
    }
    }

