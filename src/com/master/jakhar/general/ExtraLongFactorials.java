import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by pankajjakhar on 23/12/17.
 *
 */
public class ExtraLongFactorials {
    private static Scanner scanner;
    private static int N;
    private static HashMap<Integer, BigInteger> numberToFactorialValueMap;
    private static int iterationsCount;

    public static void main(String[] args) {
        process();
    }

    private static void process() {
        iterationsCount = 0;
        scanner = new Scanner(System.in);
        numberToFactorialValueMap = new HashMap<Integer, BigInteger>();
        System.out.print("Enter the number: ");
        N = scanner.nextInt();
        BigInteger result = calculateFactorial(N);
        //System.out.println(result.toString());
        System.out.printf("\nFactorial of %d: " + result.toString(), N);
        //System.out.printf("\nIterations Count: %d", iterationsCount);
    }

    private static BigInteger calculateFactorial(int number) {
        if(number == 0 || number == 1) return BigInteger.valueOf(number);
        if(numberToFactorialValueMap.containsKey(number)) return numberToFactorialValueMap.get(number);

        iterationsCount++;

        BigInteger result = (BigInteger.valueOf(number)).multiply(calculateFactorial(number - 1));
        numberToFactorialValueMap.put(number, result);
        return result;
    }
}
