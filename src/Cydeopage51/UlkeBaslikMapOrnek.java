package Cydeopage51;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

    public class UlkeBaslikMapOrnek {
        public static void main(String[] args) {


//Bu örnek, ulkeBaslikMap adlı bir HashMap oluşturur ve çeşitli ülke ve başkent çiftlerini ekler. Daha sonra,
// entrySet() metodu kullanılarak HashMap içindeki tüm çiftleri döngüyle gezerek ülke
// ve başkent bilgilerini ekrana yazdırır.
// HashMap oluşturma ve ülke başkentleri ekleme ikililier güzel bir öremnek


            HashMap<String, String> ulkeBaslikMap = new HashMap<>();
            ulkeBaslikMap.put("Türkiye", "Ankara");
            ulkeBaslikMap.put("ABD", "Washington D.C.");
            ulkeBaslikMap.put("Almanya", "Berlin");
            ulkeBaslikMap.put("Fransa", "Paris");
            ulkeBaslikMap.put("İngiltere", "Londra");

            // HashMap içindeki tüm ülke ve başkentlerini listeleme
            System.out.println("Ülke Başkentleri:");
            for (Map.Entry<String, String> entry : ulkeBaslikMap.entrySet()) {
                String ulke = entry.getKey();
                String baslik = entry.getValue();
                System.out.println(ulke + " - " + baslik);
            }
        }
    }

