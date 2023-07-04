package Myself;

import java.util.Scanner;

public class swich {
    public static void main(String[] args) {
        //Bu program, kullanıcıdan bir sayı alır ve bu sayıyı switch-case yapısıyla kontrol eder.
        // Girilen sayıya göre ilgili durumu ekrana yazdırır.
        //Örneğin, kullanıcı 2 sayısını girdiğinde, "Girilen sayı 2'ye eşittir." mesajını alır.
        // Girilen sayı 5 olsaydı, "Girilen sayı 1, 2 veya 3 değildir." mesajını alırdınız.
        //Programı çalıştırarak, switch-case yapısının nasıl çalıştığını görebilirsiniz.
        // Kullanıcının girdiği sayıya göre farklı çıktılar alacaksınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı girin: ");
        int sayi = scanner.nextInt();

        switch (sayi) {
            case 1:
                System.out.println("Girilen sayı 1'e eşittir.");
                break;
            case 2:
                System.out.println("Girilen sayı 2'ye eşittir.");
                break;
            case 3:
                System.out.println("Girilen sayı 3'e eşittir.");
                break;
            default:
                System.out.println("Girilen sayı 1, 2 veya 3 değildir.");
        }

        scanner.close();
    }
    }
