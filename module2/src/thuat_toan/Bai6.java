package thuat_toan;

import java.util.ArrayList;
import java.util.List;

public class Bai6 {
    public static void main(String[] args) {
        String string = "abdcef";
        findChar(string);
    }

    public static void findChar(String string) {
        List<Character> strings = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            strings.add(string.charAt(i));
        }
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (strings.get(i).equals(strings.get(j))) {
                    characterList.add(strings.get(i));
                    break;
                }
            }
        }
        System.out.println(characterList);
    }
}
