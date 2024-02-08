package do_while;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a prime number");
            num = sc.nextInt();
        }
        while (!isPrime(num));
        System.out.println("You have entered a prime number: " + num);
    }
    static boolean isPrime(int n){
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
