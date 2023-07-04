package Myself;

import java.util.Scanner;

public class MultiplyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir double değer girin: ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Lütfen bir int değer girin: ");
        int intValue = scanner.nextInt();

        double result = doubleValue * intValue;
        System.out.println("Çarpım sonucu: " + result);

        scanner.close();
    }
}
