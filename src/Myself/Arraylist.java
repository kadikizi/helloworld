package Myself;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // String tipte elemanları tutan bir ArrayList oluşturuyoruz
        ArrayList<String> renkler = new ArrayList<>();

        // ArrayList'e eleman ekleme
        renkler.add("Kırmızı");
        renkler.add("Mavi");
        renkler.add("Yeşil");

        // ArrayList'in boyutunu alma
        int boyut = renkler.size();
        System.out.println("ArrayList'in boyutu: " + boyut);

        // ArrayList'den eleman çekme
        String ilkRenk = renkler.get(0);
        System.out.println("İlk renk: " + ilkRenk);

        // ArrayList'deki bir elemanı değiştirme
        renkler.set(1, "Sarı");
        System.out.println("Değiştirilmiş renkler: " + renkler);

        // ArrayList'den eleman silme
        renkler.remove(2);
        System.out.println("Silinmiş renkler: " + renkler);

        // ArrayList'de bir elemanın indexini bulma
        int index = renkler.indexOf("Kırmızı");
        System.out.println("Kırmızı'nın indexi: " + index);

        // ArrayList'in boş olup olmadığını kontrol etme
        boolean bosMu = renkler.isEmpty();
        System.out.println("ArrayList boş mu? " + bosMu);

        // ArrayList'i temizleme
        renkler.clear();
        System.out.println("Temizlenmiş renkler: " + renkler);
    }
    }
