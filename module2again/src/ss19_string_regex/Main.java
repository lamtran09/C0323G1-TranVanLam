package ss19_string_regex;

public class Main {
    String solution(String s) {
        String arr = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                arr += " " + s.toLowerCase().charAt(i);
            } else {
                arr += s.charAt(i);
            }
        }
        return arr.toString().trim();


    }
}
