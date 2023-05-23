package ss13_search_algorithm.bai_tap.binary_search_algorithm;

public class BinarySearch {
    public static int binarySearch(int[] array, int left, int right, int value) {
        left = 0;
        right = array.length - 1;
        int middle = (right + left) / 2;
        while (left < right) {
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] < value) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

}
