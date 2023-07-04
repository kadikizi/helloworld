package Myself;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir tamsayı girin: ");
        int number = scanner.nextInt();
        System.out.println("Girdiğiniz tamsayı: " + number);

        System.out.print("Lütfen bir ondalık sayı girin: ");
        double decimal = scanner.nextDouble();
        System.out.println("Girdiğiniz ondalık sayı: " + decimal);

        scanner.nextLine(); // Bir satır atla

        System.out.print("Lütfen bir metin girin: ");
        String text = scanner.nextLine();
        System.out.println("Girdiğiniz metin: " + text);

        scanner.close();
    }
}


