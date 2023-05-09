package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        System.out.println("Enter Your Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
