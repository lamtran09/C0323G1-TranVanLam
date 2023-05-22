package ss11_dsa_stack_queue.bai_tap.string_palindrome;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        boolean flag = false;
        String palindrome = "Able was I ere I saw Elba";
        String[] array = palindrome.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            queue.add(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (stack.pop() != queue.poll()) {
                flag = true;
                break;
            }
        }
        if (flag ==true) {
            System.out.println("Chuỗi palindrome: " + stack + queue);
        } else {
            System.out.println("Đây không phải la chuổi palindrome");
        }
    }
}
