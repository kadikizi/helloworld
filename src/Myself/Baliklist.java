package Myself;

public class Baliklist {
    public static void main(String[] args) {
        int deterjanFiyati = 45;
        int balikFiyati = 34;
        int ekmekFiyati = 33;
        int robotFiyati = 6;
        int suFiyati = 2;
        int biskuvitFiyati = 67;

        int toplamFiyat = deterjanFiyati + balikFiyati + (ekmekFiyati * 2) + robotFiyati + suFiyati + biskuvitFiyati;

        int saatlikUcret = 15;
        int gunlukCalismaSaati = 5;

        int toplamCalismaSuresi = (int) Math.ceil((double) toplamFiyat / (saatlikUcret * gunlukCalismaSaati));
        int calismaGun = toplamCalismaSuresi / gunlukCalismaSaati;
        int calismaSaat = toplamCalismaSuresi % gunlukCalismaSaati;

        System.out.println("Alışveriş listesi için çalışmanız gereken toplam süre: " + calismaGun + " gün " + calismaSaat + " saat");
    }
    }

