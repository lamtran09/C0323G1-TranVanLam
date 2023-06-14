package ss13_search_algorithm.thuc_hanh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "CodegymDaNang";
        String arr = "";
        for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    arr +=" "+ s.toLowerCase().charAt(i);
                } else {
                    arr += s.charAt(i);

            }
        }
        System.out.println(arr.toString().trim());
    }
}

