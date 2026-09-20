import java.util.Scanner;

public class Solution {

    // Function to count prime numbers less than n
    public static int countPrimes(int n) {
        if (n <= 2) return 0;

        // Step 1: Assume all numbers are prime
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Step 2: Mark non-prime numbers
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as false
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 3: Count primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = countPrimes(n);

        System.out.println("Number of prime numbers less than " + n + " is: " + result);

        sc.close();
    }
}

