package methods;

import java.util.Arrays;

public class ParametersOfMethod {
    public static void main(String[] args) {
        System.out.println(sum2(1, 2, 3, 4, 5));
    }

    public static int sum1(int[] arr) {
        return Arrays.stream(arr).parallel().sum();
    }

    public static int sum2(int... arr) {
        return Arrays.stream(arr).parallel().sum();
    }

    public static boolean isPowerOfTwo(long n) {
        if (n == 0) return false;
        while (n != 1) {
            if (n % 2 == 1) {
                return false;
            }
            n /= 2;
        }
        return true;
        // return (n > 0) && ((n & (n - 1)) == 0);
    }
}

