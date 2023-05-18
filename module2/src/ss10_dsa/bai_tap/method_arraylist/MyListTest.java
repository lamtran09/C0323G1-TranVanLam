package ss10_dsa.bai_tap.method_arraylist;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Object> myList = new MyList<>();
        ArrayList<Integer> arrayList;
        arrayList = new ArrayList<>();
        arrayList.add(9);
        System.out.println(arrayList.get(0));
    }
}
