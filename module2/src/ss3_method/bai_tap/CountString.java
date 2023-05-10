package ss3_method.bai_tap;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String character = "Quảng Bình quê ta ơi";
        System.out.println(character);
        char check;
        System.out.println("Nhập vào ký tự bạn muốn kiểm tra");
        check = scanner.nextLine().charAt(0);
        int index=0;
        for (int i = 0; i < character.length(); i++) {
            if (check == character.charAt(i)) {
                count++;
                index=i;
            }
        }
        System.out.println("Tổng số ký tự có trong chuỗi la "+character.length());
        System.out.println("ký tự " + check + " xuất hiện " + count+" lần ở vị trí thứ "+index+" trong chuỗi");
    }
}
