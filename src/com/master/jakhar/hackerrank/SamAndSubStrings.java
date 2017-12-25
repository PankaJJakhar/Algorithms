import java.util.Scanner;

/**
 * Created by pankajjakhar on 24/12/17.
 *
 * @problemLink: https://www.hackerrank.com/challenges/sam-and-substrings/problem
 *
 * Solution:
 *
 * Step 1: Lets assume that input String of numbers is = 123
 *
 * Step 2: Lets break it in numbers as per explanation problem.
 *
 *      => 1, 2, 3, 12, 23, 123
 *
 * Step 3: Break above numbers in Decimal places.
 *
 *      => 1 = 1 * 10 ^ 0
 *      => 2 = 2 * 10 ^ 0
 *      => 3 = 3 * 10 ^ 0
 *      => 12 = 1 * 10 ^ 1 + 2 * 10 ^ 0
 *      => 23 = 2 * 10 ^ 1 + 3 * 10 ^ 0
 *      => 123 = 1 * 10 ^ 2 + 2 * 10 ^ 1 + 3 * 10 ^ 0
 *
 * Step 4: Sum all the break-downs. I am writing break-down with number for clarity in [].
 *
 *      = [1] 1 * 10 ^ 0 + [2] 2 * 10 ^ 0 + [3] 3 * 10 ^ 0 +
 *          [12] 1 * 10 ^ 1 + 2 * 10 ^ 0 + [23] 2 * 10 ^ 1 + 3 * 10 ^ 0 +
 *          [123] 1 * 10 ^ 2 + 2 * 10 ^ 1 + 3 * 10 ^ 0
 *
 *      Further reduce it:
 *      = 3 * 3 * (10 ^ 0) + 2 * 2 * (10 ^ 1 + 10 ^ 0) + 1 * 1 * (10 ^ 2 + 10 ^ 1 + 10 ^ 0)
 *
 *  Step 5: Reduce it further after solving series of 10 ^ n.
 *
 *      = 3 * 3 * (1) + 2 * 2 * (11) + 1 * 1 * (111)
 *      = 9 + 44 + 111
 *      = 164
 *
 *  => 164 is the answer for input 123.
 *
 *  Step 6: Derived formula.
 *      For Kth number for input String of size N at position P.
 *      => P * K * (N times 1) + (P - 1) * K * (N - 1 times 1) + and so on.
 *
 */
public class SamAndSubStrings {
    private static Scanner scanner;
    private final static int MOD = 1000000007;

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        scanner = new Scanner(System.in);
        int exp = (int) Math.pow(10, 9) + 7;

        //System.out.print("\nEnter input String(must be a number): ");
        String query = scanner.next();
        long sum = solve(getInputArray(query));

        //System.out.printf("Sum is: %d\n", sum);
        System.out.println(sum % MOD);
    }

    private static int[] getInputArray(String query) {
        int lengthQuery = query.length();
        int[] inputArray = new int[lengthQuery];

        for(int index = lengthQuery - 1; index >= 0; index--) {
            inputArray[index] = Character.getNumericValue(query.charAt(lengthQuery - index - 1));
        }
        return inputArray;
    }

    private static long solve(int[] inputArray) {
        int arrayLength = inputArray.length;
        long sum = 0;

        long multiplier = 1;
        for(int index = 0; index < arrayLength; index++) {
            int number = inputArray[index];
            //long localSum = (number * (arrayLength - index) * multiplier);
            sum = (sum + (number * (arrayLength - index) * multiplier)) % MOD;

            //long powerTen = (long) (Math.pow(10, (index + 1)));
            multiplier = (multiplier * 10 + 1) % MOD;
        }

        return sum;
    }
}
