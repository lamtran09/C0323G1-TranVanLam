package ss13_search_algorithm.thuc_hanh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "CodegymDaNang";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                System.out.print(" "+s.toLowerCase().charAt(i));
            }else {
                System.out.print(s.charAt(i));
            }
        }
    }
}

