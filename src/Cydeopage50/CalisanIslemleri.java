package Cydeopage50;

import java.util.Collections;
import java.util.Comparator;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class CalisanIslemleri {

        public static void main(String[] args) {
            List<String> calisanlar = new ArrayList<>();
            calisanlar.add("ali 9");
            calisanlar.add("nusret 3");
            calisanlar.add("tarık 2");
            calisanlar.add("fatmagul 1");

            // Son 5 ayda yerlerine gelen çalışanlar
            calisanlar.remove("ali 9");
            calisanlar.add("alya");
            calisanlar.remove("nusret 3");
            calisanlar.add("nur");
            calisanlar.remove("tarık 2");
            calisanlar.add("fatih");
            calisanlar.remove("fatmagul 1");
            calisanlar.add("fahri");

            // Çalışanların adına göre sıralanması
            Collections.sort(calisanlar, Comparator.comparing(s -> s.split(" ")[0]));

            // Yeni çalışan listesini ekrana yazdırma
            System.out.println("Yeni çalışanlar:");
            for (String calisan : calisanlar) {
                System.out.println(calisan);
            }

            // "tarık 2" çalışana ait bir işe geliş mesajı
            for (String calisan : calisanlar) {
                if (calisan.startsWith("tarık")) {
                    System.out.println("Tarık, 2. ayda işe gelmiştir.");
                    break;
                }
            }
        }
    }
