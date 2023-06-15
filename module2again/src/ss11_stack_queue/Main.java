package ss11_stack_queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prime prime = new Prime();
        System.out.println("Nhập số nguyên n: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(prime.getIntegerQueue(n));
        System.out.println(prime.getIntegerStack(n));
    }
}
