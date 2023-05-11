package ss4_class_and_object.bai_tap.stop_watch;

public class Main {
    public static void main(String[] args) {
        StopWatch clock = new StopWatch();
        System.out.println(clock);
        clock.start();
        int[] arr= new int[70000];
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        clock.stop();
        System.out.println(clock.getElapsedTime());
        System.out.println(clock.getEndTime());
    }
}
