package ss1_introduction_to_java;

import java.util.Scanner;

public class ComputerApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số thứ nhất: ");
        int numberOne = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập số thứ hai: ");
        int numberTwo = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("------Chọn Phép Tính-------\n" +
                    "1.Cộng\n" +
                    "2.Trừ\n" +
                    "3.Nhân\n" +
                    "4.Chia\n" +
                    "5.Thoát");
            System.out.println("Chọn chức năng: ");
            String choice = scanner.nextLine();
            int result;
            switch (choice) {
                case "1":
                    result = numberOne + numberTwo;
                    System.out.println("Kết quả: " + result);
                    break;
                case "2":
                        System.out.println("Bạn muốn trừ như nào?\n" +
                                "1.Số thứ nhất trừ số thứ hai\n" +
                                "2.Số thứ hai trừ số thứ nhất");
                        System.out.println("Mời bạn chọn: ");
                        int choiceTwo = Integer.parseInt(scanner.nextLine());
                        if (choiceTwo == 1) {
                            result = numberOne - numberTwo;
                            System.out.println("Kết quả: " + result);
                            break;
                        } else if (choiceTwo == 2) {
                            result = numberTwo - numberOne;
                            System.out.println("Kết quả : " + result);
                            break;
                        } else {
                            System.out.println("Nhập sai rồi");
                            break;
                        }
                case "3":
                    result = numberOne * numberTwo;
                    System.out.println("Kết quả: " + result);
                    break;
                case "4":
                    System.out.println("Bạn muốn chia như nào?\n" +
                            "1.Số thứ nhất chia số thứ hai\n" +
                            "2.Số thứ hai chia thứ nhất");
                    System.out.println("Mời bạn chọn: ");
                    int choiceThree = Integer.parseInt(scanner.nextLine());
                        if (choiceThree == 1) {
                            result = numberOne / numberTwo;
                            System.out.println("Kết quả: " + result);
                            break ;
                        } else if (choiceThree == 2) {
                            result = numberTwo / numberOne;
                            System.out.println("Kết quả: " + result);
                            break ;
                        }else {
                            System.out.println("Nhập sai rồi");
                            break;
                        }
                case "5":
                    return;
                default:
                    System.out.println("Nhập sai nhập lại");
                    break;
            }
        } while (true);
    }
}
