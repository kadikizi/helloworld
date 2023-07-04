package Cydeopage25;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
      //Bu örnekte, kullanıcının 1 ila 100 arasında bir sayı tahmin etmesini isteyen bir oyun simüle edilmiştir.
        // do-while döngüsü kullanılarak kullanıcıya her turda tahmin yapması istenir. Tahmin değeri, tahmin değişkenine atanır.
        //Döngü içinde, girilen tahmin değeri gizli sayıyla (gizliSayi) karşılaştırılır.
        // Eğer tahmin değeri gizli sayıdan küçükse, "Daha yüksek bir sayı tahmin edin." mesajı ekrana yazdırılır.
        // Tahmin değeri gizli sayıdan büyükse, "Daha düşük bir sayı tahmin edin." mesajı ekrana yazdırılır.
        // Eğer tahmin değeri gizli sayıya eşitse,
        // "Tebrikler! Gizli sayıyı doğru tahmin ettiniz." mesajı ekrana yazdırılır.

        Scanner scanner = new Scanner(System.in);
        int tahmin;
        int gizliSayi = 42;

        do {
            System.out.print("Bir sayı tahmin edin (1-100 arası): ");
            tahmin = scanner.nextInt();

            if (tahmin < gizliSayi) {
                System.out.println("Daha yüksek bir sayı tahmin edin.");
            } else if (tahmin > gizliSayi) {
                System.out.println("Daha düşük bir sayı tahmin edin.");
            } else {
                System.out.println("Tebrikler! Gizli sayıyı doğru tahmin ettiniz.");
            }
        } while (tahmin != gizliSayi);
    }
}
