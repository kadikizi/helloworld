package Myself;

public class Newticket {
    public static void main(String[] args) {
        int sinemaSalonuKapasite = 35;
        int sonBiletSaati = 1245;
        int ayseBiletSaati = 1245;
        int aliBiletSaati = 1245;

        // Aynı bileti iki kişi alamaz
        if (ayseBiletSaati == sonBiletSaati && aliBiletSaati == sonBiletSaati) {
            System.out.println("Sistem kapandı, biletler tükenmiştir. Aynı bileti iki kişi alamaz.");
        } else if (ayseBiletSaati == sonBiletSaati) {
            System.out.println("Ayşe son bileti almıştır.");
        } else if (aliBiletSaati == sonBiletSaati) {
            System.out.println("Ali son bileti almıştır.");
        } else {
            System.out.println("Sistem kapandı, biletler tükenmiştir. Başka bir kişi son bileti almış olabilir.");
        }
        }}
