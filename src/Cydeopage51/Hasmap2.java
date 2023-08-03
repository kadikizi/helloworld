package Cydeopage51;

    //Bu örnekte, "telefonDefteri" adında bir TreeMap oluşturduk
    // ve içine kişilerin isimlerini ve telefon numaralarını ekledik.
    // Daha sonra verilere erişip, anahtarları kontrol edip ve silip TreeMap'in boyutunu aldık.

import java.util.TreeMap;

public class Hasmap2 {
    public static void main(String[] args) {
        // TreeMap oluşturma
        TreeMap<String, Integer> telefonDefteri = new TreeMap<>();

        // Verileri ekleme
        telefonDefteri.put("Ayşe", 123456789);
        telefonDefteri.put("Fatih", 987654321);
        telefonDefteri.put("Yunus", 555555555);
        telefonDefteri.put("Burak", 999999999);
        telefonDefteri.put("Nesrin", 111111111);

        // Verilere erişim ve ekrana yazdırma
        System.out.println("Ayşe'nin telefon numarası: " + telefonDefteri.get("Ayşe"));
        System.out.println("Fatih'in telefon numarası: " + telefonDefteri.get("Fatih"));
        System.out.println("Yunus'un telefon numarası: " + telefonDefteri.get("Yunus"));
        System.out.println("Burak'ın telefon numarası: " + telefonDefteri.get("Burak"));
        System.out.println("Nesrin'in telefon numarası: " + telefonDefteri.get("Nesrin"));

        // Bir anahtarın var olup olmadığını kontrol etme
        if (telefonDefteri.containsKey("Fatih")) {
            System.out.println("Fatih anahtarı mevcut.");
        } else {
            System.out.println("Fatih anahtarı mevcut değil.");
        }

        // Bir değerin var olup olmadığını kontrol etme
        if (telefonDefteri.containsValue(987654321)) {
            System.out.println("987654321 numarası mevcut.");
        } else {
            System.out.println("987654321 numarası mevcut değil.");
        }

        // Bir anahtarı silme
        telefonDefteri.remove("Yunus");
        System.out.println("Yunus anahtarı silindi.");

        // TreeMap'in boyutunu alma
        System.out.println("TreeMap boyutu: " + telefonDefteri.size());
    }
}


