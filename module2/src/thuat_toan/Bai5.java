package thuat_toan;

import java.util.Arrays;

public class Bai5 {
    public static void main(String[] args) {
        int[] arr = {-1, 150, 190, 170, -1, -1, 160, 180};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                   if(arr[i]<arr[j]&& arr[i]!=-1){
                       temp = arr[i];
                       arr[i]=arr[j];
                       arr[j] = temp;
                   }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
