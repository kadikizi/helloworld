package Cydeopage21;

public class Diziyonetimi {
    public static void main(String[] args) {
        //Java'da dizi yönetimi, bellekte ardışık olarak saklanan verilerin erişimini ve
        // manipülasyonunu sağlayan bir programlama yöntemidir.
        // Dizi, aynı türdeki verilerin bir araya getirilerek oluşturulmuş
        // bir veri yapısıdır. Dizi yönetimi, dizilerin oluşturulması, eleman eklenmesi,
        // eleman çıkarılması, elemanların değiştirilmesi ve dizinin boyutunun değiştirilmesi gibi işlemleri içerir

        // 5 elemanlı bir dizi oluşturuluyor
        int[] dizi = new int[5];

        // Diziye elemanlar ekleniyor
        dizi[0] = 10;
        dizi[1] = 20;
        dizi[2] = 30;
        dizi[3] = 40;
        dizi[4] = 50;

        // Dizideki elemanlar listeleniyor
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Dizinin " + i + ". elemanı: " + dizi[i]);
        }
    }}

