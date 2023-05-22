package ss11_dsa_stack_queue.string_map;

import java.util.*;

public class MapString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();
        System.out.print("Nhập chuỗi để kiểm tra từ: ");
        String string = scanner.nextLine();
        String[] array = string.toLowerCase().split(" ");
        int count;
        for (String s : array) {
            count = 0;
            for (String value : array) {
                if (s.equals(value)) {
                    count++;
                }
            }
            map.put(s, count);
        }
        Set<String> key = map.keySet();
        for (String p : key) {
            System.out.println("key: " + p + ", value: " + map.get(p));
        }
    }
}
