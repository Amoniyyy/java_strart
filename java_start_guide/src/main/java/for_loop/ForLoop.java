package for_loop;


public class ForLoop {
    public static void main(String[] args) {
        int someNumber = 87;
        for (int i = 2; i * i < someNumber; i++) {
            if (someNumber % i == 0) {
                System.out.println("Its not a prime number");
                break;
            }
        }
    }
}
