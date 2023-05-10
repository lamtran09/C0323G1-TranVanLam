package ss2_array_and_loop.bai_tap;


public class ShowPrimesLessThanOneHundred {
    public static void main(String[] args) {
        int num = 2;
        while (num < 100) {
            if (ShowFirstTwentyPrimes.isPrime(num)) {
                System.out.print(num + ",");
            }
            num++;
        }
    }
}
