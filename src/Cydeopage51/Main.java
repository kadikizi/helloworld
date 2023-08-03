package Cydeopage51;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        // HashMap oluşturulması
        HashMap<String, String> capitals = new HashMap<>();

        // Başkent ve ülke isimlerinin eklenmesi
        capitals.put("Türkiye", "Ankara");
        capitals.put("Almanya", "Berlin");
        capitals.put("Fransa", "Paris");
        capitals.put("İtalya", "Roma");
        capitals.put("İngiltere", "Londra");
        capitals.put("Rusya", "Moskova");
        capitals.put("ABD", "Washington D.C.");
        capitals.put("Çin", "Pekin");
        capitals.put("Japonya", "Tokyo");
        capitals.put("Brezilya", "Brasilia");

        // HashMap'i döngü ile yazdırma
        for (String country : capitals.keySet()) {
            String capital = capitals.get(country);
            System.out.println("Ülke: " + country + " - Başkent: " + capital);
        }
    }
}