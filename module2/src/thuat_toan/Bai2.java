package thuat_toan;

import java.util.ArrayList;
import java.util.List;

public class Bai2 {
    public static void main(String[] args) {
        String str = "Abcdef1234";
        String arr = "Uykhldg1";
        commonCharacterCount(str, arr);
    }

    public static void commonCharacterCount(String s1, String s2) {
        List<Character> characterList = new ArrayList<>();
        List<Character> characterList1 = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            characterList.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            characterList1.add(s2.charAt(i));
        }
        for (int i = 0; i < characterList.size(); i++) {
            for (int j = 0; j < characterList1.size(); j++) {
                if (characterList.get(i).equals(characterList1.get(j))) {
                    characterList1.remove(characterList1.get(j));
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
