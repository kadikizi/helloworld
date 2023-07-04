package Cydeostring20.Diziler;

import java.util.Scanner;

public class Lenght {
    public static void main(String[] args) {
        //Dizinin uzunluğunu (eleman sayısını) döndürür.
        // Örneğin, dizi.length ifadesi, "dizi" adlı dizinin uzunluğunu verir
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        int uzunluk = metin.length();

        System.out.println("Girilen metnin uzunluğu: " + uzunluk);

    }
}
