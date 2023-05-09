package ss2_array_and_loop.bai_tap;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        System.out.println("Menu\n" +
                "1.Print the rectangle\n" +
                "2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                "3.Print isosceles triangle\n" +
                "4.Exit");
        Scanner scanner = new Scanner(System.in);
        int select;
        select = Integer.parseInt(scanner.nextLine());
        switch (select) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*   ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <5-i ; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <i ; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 0; j < 5-i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

                break;
            case 3:
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= 10; j++) {
                        if (j < 5 + i && j > 5 - i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }System.out.println();
                }
                break;
            case 4:
                System.out.println("Bye Bye!");
        }
    }
}


