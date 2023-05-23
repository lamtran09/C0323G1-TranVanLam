package ss11_dsa_stack_queue.bai_tap.string_palindrome;

import java.util.*;

public class Palindrome {
//    public static void main(String[] args) {
//        String palindrome = "able was I ere I saw elba";
//        String[] array = palindrome.split("");
//        Stack<String> stack = new Stack<>();
//        Queue<String> queue = new ArrayDeque<>();
//        System.out.println(Arrays.toString(array));
//        for (String s : array) {
//            stack.push(s);
//            queue.add(s);
//        }
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (Objects.equals(stack.pop(), queue.poll())) {
//                count++;
//            }
//        }
//        if (count == array.length) {
//            System.out.println("Chuỗi palindrome");
//        } else {
//            System.out.println("Đây không phải là chuỗi palindrome");
//
//        }
//    }
    public static void main(String[] args) {
        String palindrome = "able was I ere I saw elba";
        String[] array = palindrome.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        System.out.println(Arrays.toString(array));
        for (String s : array) {
            stack.push(s);
            queue.add(s);
        }
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (!Objects.equals(stack.pop(), queue.poll())) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Chuỗi palindrome");
        } else {
            System.out.println("Đây không phải là chuỗi palindrome");

        }
    }
}
