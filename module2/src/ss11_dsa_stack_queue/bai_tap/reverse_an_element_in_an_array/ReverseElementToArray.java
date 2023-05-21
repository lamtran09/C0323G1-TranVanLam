package ss11_dsa_stack_queue.bai_tap.reverse_an_element_in_an_array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElementToArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println("các phần tử sau khi đảo ngược là" + stack);
        Stack<Character> wStack = new Stack<>();
        String mWord = "hello my friends";
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i));
        }
        System.out.println(wStack);
        String arrCharactor = "";
        for (int i = 0; i < mWord.length(); i++) {
            arrCharactor += wStack.pop();
        }
        System.out.println(arrCharactor);
    }

}
