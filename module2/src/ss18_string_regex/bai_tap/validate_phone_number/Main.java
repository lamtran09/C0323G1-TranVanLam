package ss18_string_regex.bai_tap.validate_phone_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        do{
            System.out.println("Nhập số điện thoại theo định dạng((xx)-(0xxxxxxxxx)): ");
            phoneNumber = scanner.nextLine();
        }while (!Validate.validatePhoneNumber(phoneNumber));
        System.out.println("Confirm!!!!!");
    }
}
