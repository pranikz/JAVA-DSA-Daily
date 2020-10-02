// Sexy Prime
// In mathematics, Sexy Primes are prime numbers that differ from each other by six. For example, the numbers 5 and 11 are both sexy primes, because they differ by 6. If p + 2 or p + 4 (where p is the lower prime) is also prime.

// They can be grouped as:

// Sexy prime pairs : It is of the form (p, p + 6), where p and p + 6 are prime numbers.
// Eg. (11, 17) is a sexy prime pairs.
// Sexy prime triplets : Triplets of primes (p, p + 6, p + 12) such that p + 18 is composite are called sexy prime triplets.
// Eg. (7, 13, 19) is a Sexy prime triplets.
// Sexy prime quadruplets : Sexy prime quadruplets (p, p + 6, p + 12, p + 18) can only begin with primes ending in a 1 in their decimal representation (except for the quadruplet with p = 5).
// Eg. (41, 47, 53, 59) is a Sexy prime quadruplets.
// Sexy prime quintuplets : In an arithmetic progression of five terms with common difference 6, one of the terms must be divisible by 5, because the two numbers are relatively prime. Thus, the only sexy prime quintuplet is (5, 11, 17, 23, 29); no longer sequence of sexy primes is possible.
// Given a range of the form [L, R].The task is to print all the sexy prime pairs in the range.
// Refer :- https://www.geeksforgeeks.org/sexy-prime/
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