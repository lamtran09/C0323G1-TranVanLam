package ss2_array_and_loop.bai_tap;


public class ShowPrimesLessThanOneHundred {
    public static void main(String[] args) {
        int n = 2;
        while (n < 100) {
            if (ShowFirstTwentyPrimes.isPrime(n)) {
                System.out.print(n + ",");
            }
            n++;
        }
    }
}











