package methods;

public class ReturnTypeMethods {
    public static void main(String[] args) {
        ReturnTypeMethods method = new ReturnTypeMethods();
        System.out.println(method.isPrime(17));
    }
    public boolean isPrime(int n){
        for (int i = 2; i * i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
