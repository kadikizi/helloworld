package Cydeopage24;

import java.util.Scanner;

public class Scannerornek2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tamsayı girin: ");
        int tamsayi = scanner.nextInt();

        System.out.print("Bir ondalıklı sayı girin: ");
        double ondalikliSayi = scanner.nextDouble();

        System.out.println("Girilen tamsayı: " + tamsayi);
        System.out.println("Girilen ondalıklı sayı: " + ondalikliSayi);
    }
}
