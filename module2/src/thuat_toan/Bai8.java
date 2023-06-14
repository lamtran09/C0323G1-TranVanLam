package thuat_toan;

import java.util.ArrayList;
import java.util.List;

public class Bai8 {
    public static void main(String[] args) {
        int[] parent = {1, 4, 5, 2,  2, 1};
        int[] child = {1, 2, 3};
        checkF(parent, child);
    }

    public static void checkF(int[] parent, int[] child) {
        int count = 0;
        List<Integer> integerList1 = new ArrayList<>();
        for (int i = 0; i < child.length; i++) {
            count = 0;
            for (int j = 0; j < parent.length; j++) {
                if (child[i] == parent[j]) {
                    count++;
                }

            }
            integerList1.add(count);
        }
        integerList1.sort((o1, o2) -> o1 - o2);
        System.out.println(integerList1.get(0));
    }
}
