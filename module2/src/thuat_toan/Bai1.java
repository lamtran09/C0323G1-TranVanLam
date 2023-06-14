package thuat_toan;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        String str = "1221";
        String[] array = str.split("");
        Map<String, Integer> integerMap = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            integerMap.put(array[i], integerMap.getOrDefault (array[i], 0) + 1);
        }
        Set<String> integerSet = integerMap.keySet();
        List<Integer> stringList = new ArrayList<>();

        for (String key : integerSet) {
            System.out.println("key: " + key + ", value: " + integerMap.get(key));
            stringList.add(integerMap.get(key));
        }
        for (int i = 0; i < stringList.size() - 1; i++) {
            if (stringList.get(i) != (stringList.get(i+1))) {
                System.out.println("tần số xuất hiện của tất cả các số nguyên trong không mảng bằng nhau");
                break;
            } else {
                System.out.println("tần số xuất hiện của tất cả các số nguyên trong mảng bằng nhau");
                break;
            }
        }

    }

}




