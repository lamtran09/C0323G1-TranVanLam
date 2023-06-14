package ss2_loop;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SumOfDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số cần tính tổng ước của nó: ");
        int number = Integer.parseInt(scanner.nextLine());
        int sumOfDivision=  0;
        Set<Integer> integerSet = new TreeSet<>();
        for (int i = 1; i <=number ; i++) {
            if(number%i==0){
                sumOfDivision += i;
                integerSet.add(i);
            }
        }
        System.out.println("Các ước của "+number+" là: "+integerSet);
        System.out.println("Tổng các ước của "+number+" là "+sumOfDivision);
    }
}
