package while_loop;

public class WhileLoop {
    public static void main(String[] args) {
        long factorial = 1;
        long num = 1;
        while (num <= 10){
            factorial = factorial * num;
            num++;
        }
    }
    static int factorial (int n){
        int sum = 1;
        int i = 1;
        while (i <= n) {
            sum *= i;
            i++;
        }
        return sum;
    }
}
