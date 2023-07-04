package Cydeostring20.Diziler;

import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {

        //binary Search: Sıralı bir dizide belirli bir elemanı arar. Arrays.binarySearch(dizi, arananEleman) ifadesi,
        //           "dizi" adlı dizide "arananEleman"ı arar ve bulduğu indeksi döndürür.
        //           Eğer eleman dizide bulunmazsa, negatif bir değer döndürür.


        int[] dizi = {2, 5, 8, 12, 15, 20, 25, 30};
        int arananEleman = 15;

        int sonuc = Arrays.binarySearch(dizi, arananEleman);

        if (sonuc >= 0) {
            System.out.println("Eleman bulundu, indeks: " + sonuc);
        } else {
            System.out.println("Eleman bulunamadı.");
        }
    }
}
