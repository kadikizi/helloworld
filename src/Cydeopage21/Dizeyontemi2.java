package Cydeopage21;

import java.util.Arrays;

public class Dizeyontemi2 {
    public static void main(String[] args) {

        //Java'da dizi yöntemleri, bir dizinin elemanlarını yönetmek,
        // erişmek, değiştirmek veya diziyle ilgili bilgileri almak için kullanılan özel fonksiyonlardır.

     /*      1.length: Dizinin uzunluğunu (eleman sayısını) döndürür. Örneğin, dizi.length ifadesi, "dizi" adlı dizinin uzunluğunu verir.

           2.clone: Bir dizinin tam bir kopyasını oluşturur. dizi.clone() ifadesi, "dizi" adlı dizinin tam bir kopyasını döndü

           3.toString: Bir diziyi dize (string) olarak temsil eden bir ifade döndürür. Arrays.toString(dizi) ifadesi,
           "dizi" adlı dizinin dize temsilini döndürür.

           4.sort: Bir diziyi sıralar. Arrays.sort(dizi) ifadesi, "dizi" adlı diziyi küçükten büyüğe sıralar.

           5.binary Search: Sıralı bir dizide belirli bir elemanı arar. Arrays.binarySearch(dizi, arananEleman) ifadesi,
           "dizi" adlı dizide "arananEleman"ı arar ve bulduğu indeksi döndürür. Eğer eleman dizide bulunmazsa, negatif bir değer döndürür.

           6.fill: Bir dizinin tüm elemanlarını belirli bir değerle doldurur. Arrays.fill(dizi, deger) ifadesi, "dizi" adlı dizinin tüm
           elemanlarını "deger" ile doldurur.

           7.copyOf: Bir dizinin belirli bir uzunluğunu alır ve yeni bir dizi oluşturur. Arrays.copyOf(dizi, yeniUzunluk) ifadesi,
           "dizi" adlı dizinin "yeniUzunluk" kadarlık bir kopyasını döndürür. Eğer "yeniUzunluk" orijinal diziden daha küçükse,
            eksik kalan elemanlar varsayılan değerle doldurulur.

            8.equals: İki dizinin eşit olup olmadığını kontrol eder. Arrays.equals(dizi1, dizi2) ifadesi, "dizi1" ve "dizi2"
            adlı dizilerin elemanlarının aynı olup olmadığını kontrol eder.

       */

        //Bu yöntemler, Java'nın java.util.Arrays sınıfı içerisinde tanımlıdır ve dizilerle ilgili çeşitli işlemleri kolaylaştırmak için kullanılır.


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
