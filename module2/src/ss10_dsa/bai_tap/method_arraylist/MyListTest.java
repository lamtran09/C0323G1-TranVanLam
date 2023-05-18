package ss10_dsa.bai_tap.method_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integer = new MyList<>();
        integer.addElements(0,1);
        integer.addElements(1,2);
        integer.addElements(4,4);
        integer.addElements(6,5);
        System.out.println(integer);
    }
}
