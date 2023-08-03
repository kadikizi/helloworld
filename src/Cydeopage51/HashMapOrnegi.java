package Cydeopage51;


import java.util.HashMap;

//HashMap, Java'da sık kullanılan bir veri yapısıdır ve anahtar-değer çiftlerini depolamak için kullanılır.
// Bir anahtarın benzersiz olması ve bir değeri temsil etmesi nedeniyle,
// anahtarlar ve değerler arasında hızlı bir eşleme sağlar.
// Bu yapı, verilerin hızlı bir şekilde eklendiği, erişildiği, güncellendiği ve silindiği bir veri koleksiyonudur.
//Java'da HashMap, "java.util" paketinde bulunan bir sınıftır ve genellikle aşağıdaki durumlarda kullanılır:
//Veri eşleştirmesi
//Hızlı erişim
//Veri ekleme ve güncelleme:
// Veri silme
//Eşsiz anahtarlar

public class HashMapOrnegi {
    public static void main(String[] args) {
        // HashMap oluşturma
        HashMap<String, Integer> yaslar = new HashMap<>();

        // Verileri ekleme
        yaslar.put("Ali", 25);
        yaslar.put("Ayşe", 30);
        yaslar.put("Mehmet", 22);
        yaslar.put("Zeynep", 28);

        // Verilere erişim ve ekrana yazdırma
        System.out.println("Ali'nin yaşı: " + yaslar.get("Ali"));
        System.out.println("Ayşe'nin yaşı: " + yaslar.get("Ayşe"));
        System.out.println("Mehmet'in yaşı: " + yaslar.get("Mehmet"));
        System.out.println("Zeynep'in yaşı: " + yaslar.get("Zeynep"));

        // Belirli bir anahtarın değerini güncelleme
        yaslar.put("Ali", 26);
        System.out.println("Ali'nin yeni yaşı: " + yaslar.get("Ali"));

        // Bir anahtarın var olup olmadığını kontrol etme
        if (yaslar.containsKey("Ali")) {
            System.out.println("Ali anahtarı mevcut.");
        } else {
            System.out.println("Ali anahtarı mevcut değil.");
        }

        // Bir değerin var olup olmadığını kontrol etme
        if (yaslar.containsValue(30)) {
            System.out.println("Yaşı 30 olan biri mevcut.");
        } else {
            System.out.println("Yaşı 30 olan biri mevcut değil.");
        }

        // Bir anahtarı silme
        yaslar.remove("Mehmet");
        System.out.println("Mehmet anahtarı silindi.");

        // HashMap'in boyutunu alma
        System.out.println("HashMap boyutu: " + yaslar.size());
    }
}

