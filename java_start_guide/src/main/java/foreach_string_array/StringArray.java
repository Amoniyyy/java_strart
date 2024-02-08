package foreach_string_array;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class StringArray {
    public static void main(String[] args) {
        String[] words = new String[5];
        words[0] = "Hello!";
        words[1] = "And welcome to Los Polos Sermanos Family";
        words[2] = "My name is";
        words[3] = "Gustavo";
        words[4] = ", but you can call me GUS";

        for (String s : words) {
            System.out.print(s + " ");
        }
    }
}
