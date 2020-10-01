import java.util.Arrays;

public class SexyPrimeNumber {
    public static int[] sexyPrime(int upper, int lower) {
        int result[] = new int[upper + lower];
        int counter = 0;
        while (lower <= upper) {
            boolean flag = false;
            for (int i = 2; i < lower / 2; i++) {
                if (lower % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag && lower != 0 && lower != 1) {
                result[counter++] = lower;
            }
            lower++;
        }
        result = Arrays.stream(result).filter(e -> e != 0 && e != 1 && e != 4).toArray();
        int counterNew = 0;
        System.out.println("All the sexy prime numbers in these intervals are:- ");
        while (counterNew < result.length) {
            int temp = result[counterNew];
            for (int i = 0; i <= result.length - 1; i++) {
                if (result[i] - temp == Math.abs(6)) {
                    System.out.print("(" + temp + "," + result[i] + ")" + " ");
                }
            }
            counterNew++;
        }
        System.out.println(" ");
        return result;
    }

    public static void main(String[] args) {
        int lower = 6;
        int upper = 59;
        int[] primeNumbers = sexyPrime(upper, lower);
        System.out.println("All the prime numbers in these intervals are:- ");
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.print(primeNumbers[i] + " ");
        }
    }
}