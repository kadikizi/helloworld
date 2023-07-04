package Myself;
import java.util.HashMap;
import java.util.Map;

public class Alisverislist {
            public static void main(String[] args) {
                // Alışveriş listesini oluşturalım
                HashMap<String, Integer> alisverisListesi = new HashMap<>();
                alisverisListesi.put("Sıvı Yağ", 20);
                alisverisListesi.put("Pirinç", 10);
                alisverisListesi.put("Pril", 15);
                alisverisListesi.put("Omo", 30);
                alisverisListesi.put("Çay", 25);

                /*

                // Alışveriş listesini yazdır
                System.out.println("Alışveriş Listesi:");
                for (String urun : alisverisListesi.keySet()) {
                    System.out.println(urun);
               }

                 */
                for (Map.Entry<String, Integer> stringIntegerEntry : alisverisListesi.entrySet()) {
                    System.out.println(stringIntegerEntry.getKey()+ "   "+stringIntegerEntry.getValue());
                }

                // Toplam fiyatı hesapla
                int toplamFiyat = 0;
                for (int fiyat : alisverisListesi.values()) {
                    toplamFiyat += fiyat;
                }

                // Toplam fiyatı yazdır
                System.out.println("Toplam Fiyat: " + toplamFiyat + " TL");

            }
        }
