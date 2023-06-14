package thuat_toan;

public class Bai3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5,7};
        System.out.println(checkArr(arr));
    }

    public static boolean checkArr(int[] arr) {

        for (int i = 1; i < arr.length - 1; i++) {
            int firstSum = 0;
            int secondSum = 0;
            for (int j = 0; j < i; j++) {
                firstSum += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                secondSum += arr[j];
            }

            if (firstSum == secondSum) {
                return true;
            }
        }
        return false;
    }
}
