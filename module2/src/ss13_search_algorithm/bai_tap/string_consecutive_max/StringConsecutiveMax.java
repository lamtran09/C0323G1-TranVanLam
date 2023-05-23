package ss13_search_algorithm.bai_tap.string_consecutive_max;

import java.util.LinkedList;
import java.util.Scanner;

public class StringConsecutiveMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String newString = scanner.nextLine();
        LinkedList<Character> maxString = new LinkedList<>();
        for (int i = 0; i < newString.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(newString.charAt(i));
            for (int j = i + 1; j < newString.length(); j++) {
                if (newString.charAt(j) > list.getLast()) {
                    list.add(newString.charAt(j));
                }else {
                    break;
                }
            }
            if (list.size() > maxString.size()) {
                maxString.clear();
                maxString.addAll(list);
            }
            list.clear();
        }
        for (Character p : maxString) {
            System.out.print(p);
        }
        System.out.println();
    }
}
