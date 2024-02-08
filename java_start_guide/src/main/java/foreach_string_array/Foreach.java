package foreach_string_array;

import java.util.Arrays;
import java.util.Random;

public class Foreach {
    public static void main(String[] args) {
        int[] arr = randomArr(10, 100);
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
    static int[] randomArr(int size, int to){
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2 * to + 1) - to;
        }
        return array;
    }
}
