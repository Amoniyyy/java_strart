package primitive_data_types;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte byteNum = 31; // -128 <-> 127
        short shortNum = 543; // -32 000 <-> 32 000
        int number = 1221233; // -2 100 000 000 <-> 2 100 000 000
        long longNum = 532345463543632L; // -9223372036854775807 <-> 9223372036854775807

        int num1 = 2;
        int num2 = 2;
        int sum = num1 + num2;
        System.out.println(sum);

        int a = 12 + 'A';

        float fl = 1.098F;
        double d = 54.6534536735;

        boolean tr = true;
        boolean fa = false;
    }

}
