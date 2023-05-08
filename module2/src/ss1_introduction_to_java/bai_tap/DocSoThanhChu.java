package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số cần đọc: ");
        int so;
        int hangTram;
        int hangChuc;
        int hangDonVi;

        so = Integer.parseInt(scanner.nextLine());
        hangDonVi = so % 10;
        hangChuc = so / 10 % 10;
        hangTram = so / 100 % 10;


        if (so >= 100 && so < 1000) {
            switch (hangTram) {
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }
            System.out.print(" Hundred");

            switch (hangChuc) {
                case 1:
                    System.out.print(" One");
                    break;
                case 2:
                    System.out.print(" Twenty");
                    break;
                case 3:
                    System.out.print(" Thirty");
                    break;
                case 4:
                    System.out.print(" Forty");
                    break;
                case 5:
                    System.out.print(" Fifty");
                    break;
                case 6:
                    System.out.print(" Sixty");
                    break;
                case 7:
                    System.out.print(" Seventy");
                    break;
                case 8:
                    System.out.print(" Eighty");
                    break;
                case 9:
                    System.out.print(" Ninety");
                    break;
            }
            switch (hangDonVi) {
                case 1:
                    System.out.println(" One");
                    break;
                case 2:
                    System.out.println(" Two");
                    break;
                case 3:
                    System.out.println(" Three");
                    break;
                case 4:
                    System.out.println(" Four");
                    break;
                case 5:
                    System.out.println(" Five");
                    break;
                case 6:
                    System.out.println(" Six");
                    break;
                case 7:
                    System.out.println(" Seven");
                    break;
                case 8:
                    System.out.println(" Eight");
                    break;
                case 9:
                    System.out.println(" Nine");
                    break;

            }
        }else if(so<100 && so >=20){
            switch (hangChuc) {
                case 1:
                    System.out.print(" one");
                    break;
                case 2:
                    System.out.print(" Twenty");
                    break;
                case 3:
                    System.out.print(" Thirty");
                    break;
                case 4:
                    System.out.print(" Forty");
                    break;
                case 5:
                    System.out.print(" Fifty");
                    break;
                case 6:
                    System.out.print(" Sixty");
                    break;
                case 7:
                    System.out.print(" Seventy");
                    break;
                case 8:
                    System.out.print(" Eighty");
                    break;
                case 9:
                    System.out.print(" Ninety");
                    break;
            }
            switch (hangDonVi) {
                case 1:
                    System.out.println(" one");
                    break;
                case 2:
                    System.out.println(" Two");
                    break;
                case 3:
                    System.out.println(" Three");
                    break;
                case 4:
                    System.out.println(" Four");
                    break;
                case 5:
                    System.out.println(" Five");
                    break;
                case 6:
                    System.out.println(" Six");
                    break;
                case 7:
                    System.out.println(" Seven");
                    break;
                case 8:
                    System.out.println(" Eight");
                    break;
                case 9:
                    System.out.println(" Nine");
                    break;
            }
            } else if (so < 20) {
            if (hangChuc == 1) {
                if (hangDonVi == 0) {
                    System.out.println("Ten");
                } else if (hangDonVi == 1) {
                    System.out.println("Eleven");
                } else if (hangDonVi == 2) {
                    System.out.println("Twelve");
                } else if (hangDonVi == 3) {
                    System.out.println("Thirteen");
                } else if (hangDonVi == 4) {
                    System.out.println("Fourteen");
                } else if (hangDonVi == 5) {
                    System.out.println("Fifteen");
                } else if (hangDonVi == 6) {
                    System.out.println("Sixteen");
                } else if (hangDonVi == 7) {
                    System.out.println("Seventeen");
                } else if (hangDonVi == 8) {
                    System.out.println("Eighteen");
                } else if (hangDonVi == 9) {
                    System.out.println("Nineteen");
                }
            } else if (so < 10 && so >= 0) {
                if (hangDonVi == 0) {
                    System.out.println("Zero");
                } else if (hangDonVi == 1) {
                    System.out.println("One");
                } else if (hangDonVi == 2) {
                    System.out.println("Two");
                } else if (hangDonVi == 3) {
                    System.out.println("Three");
                } else if (hangDonVi == 4) {
                    System.out.println("Four");
                } else if (hangDonVi == 5) {
                    System.out.println("Five");
                } else if (hangDonVi == 6) {
                    System.out.println("Six");
                } else if (hangDonVi == 7) {
                    System.out.println("Seven");
                } else if (hangDonVi == 8) {
                    System.out.println("Eight");
                } else if (hangDonVi == 9) {
                    System.out.println("Nine");
                }
            }

        }
    }
}