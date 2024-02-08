package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение угла");
        try {
            double angle = sc.nextDouble();
            double value = angle * Math.PI / 180;
            System.out.println("Значение угла " + angle + " градусов = " + value);
        } catch (Exception e){
            System.out.println("Вы не ввели число");
        }
    }
}
