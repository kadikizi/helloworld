package Cydeopage27;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {

        //do-while döngüsü, belirli bir işlemi en az bir kez
        // gerçekleştirmek ve ardından bir koşula bağlı olarak tekrar etmek için kullanılır.

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
                } while (tahmin != gizliSayi);}
}
