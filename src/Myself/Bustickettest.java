package Myself;

import java.util.Scanner;

public class Bustickettest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen otobüsün kapasitesini girin: ");
        int kapasite =       scanner.nextInt();

        System.out.print("Lütfen kaç bilet satın almak istediğinizi girin: ");
        int biletSayisi = scanner.nextInt();

        scanner.close();

        if (biletSayisi <= kapasite) {
            System.out.println("Biletler satın alındı. İyi yolculuklar!");
        } else {
            System.out.println("Üzgünüz, yeterli bilet yok. Daha az bilet satın alın veya başka bir otobüs seferi seçin.");
        }
    }
    }
