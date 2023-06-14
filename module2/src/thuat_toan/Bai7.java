package thuat_toan;

import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,8,43},{9,4,11,7},{11,6,4,0},{1,2,6,51}};
        Set<Integer> integerList = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(checkPrime(arr[i][j])){
                    integerList.add(arr[i][j]);
                }
            }
        }
                System.out.println(integerList);
    }

    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
