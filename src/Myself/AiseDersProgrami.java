package Myself;

import java.util.ArrayList;
import java.util.List;

public class AiseDersProgrami {
    public static void main(String[] args) {

       // kücük kızım ayse  iki ay için bir ders pragramı yapacak,
        // pazar gunleri çalışmayacak iki ayda  8 kitap okuyacak,
        // 3 adet bitirmesi gereken kitalar toplam 850 sayfadır
        // pragram için javada bır uygulama programıişte............

        int toplamKitapSayisi = 8;
        int bitirilmesiGerekenKitapSayisi = 3;
        int toplamSayfaSayisi = 850;
        int haftaSayisi = 8; // 2 ayda 8 hafta olduğunu varsayalım
        int pazarGunleri = haftaSayisi; // Pazar günleri çalışılmayacak

        // Pazar günleri hariç çalışma günleri hesaplanıyor
        int calismaGunleri = haftaSayisi * 7 - pazarGunleri;

        // Günlük ortalama sayfa sayısı hesaplanıyor
        int ortalamaGunlukSayfa = toplamSayfaSayisi / calismaGunleri;

        // Kitapların günlük ortalama sayfa sayısına bölünerek kaç günde bitirileceği hesaplanıyor
        int bitirmeSureleri[] = new int[toplamKitapSayisi];
        for (int i = 0; i < bitirilmesiGerekenKitapSayisi; i++) {
            bitirmeSureleri[i] = (int) Math.ceil((double) ortalamaGunlukSayfa / (double) bitirilmesiGerekenKitapSayisi);
        }

        // Kacinci gun hangi kitabin bitirileceği hesaplanıyor
        List<Integer> bitisGunleri = new ArrayList<>();
        int gunSayaci = 1;
        for (int i = 0; i < bitirilmesiGerekenKitapSayisi; i++) {
            int bitisGunSayisi = bitirmeSureleri[i];
            for (int j = 0; j < bitisGunSayisi; j++) {
                bitisGunleri.add(gunSayaci);
                gunSayaci++;
            }
        }

        // Ders programı yazdırılıyor
        System.out.println("Ders Programı:");
        for (int i = 0; i < bitisGunleri.size(); i++) {
            System.out.println("Gün " + bitisGunleri.get(i) + ": Kitap " + (i + 1));
        }
    }
    }
