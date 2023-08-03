package Cydeopage51;

    import java.util.ArrayList;
import java.util.Collections;
   import java.util.List;

    public class SayiIslemleri {
        public static void main(String[] args) {
            // Verilen sayıları içeren liste oluşturuyoruz
            List<Integer> sayilar = new ArrayList<>();
            sayilar.add(180);
            sayilar.add(720);
            sayilar.add(550);
            sayilar.add(380);
            sayilar.add(65);
            sayilar.add(98);
            sayilar.add(658);
            sayilar.add(3575);
            sayilar.add(92200);
            sayilar.add(586);

            // Tek ve çift sayıları içeren listeleri oluşturuyoruz
            List<Integer> tekSayilar = new ArrayList<>();
            List<Integer> ciftSayilar = new ArrayList<>();

            // Sayıları tek ve çift olarak ayırıyoruz
            for (int sayi : sayilar) {
                if (sayi % 2 == 0) {
                    ciftSayilar.add(sayi);
                } else {
                    tekSayilar.add(sayi);
                }
            }

            // Listeleri büyükten küçüğe sıralıyoruz
            Collections.sort(tekSayilar, Collections.reverseOrder());
            Collections.sort(ciftSayilar, Collections.reverseOrder());

            // Listeleri ekrana yazdırıyoruz
            System.out.println("Tek Sayılar (büyükten küçüğe):");
            for (int tekSayi : tekSayilar) {
                System.out.println(tekSayi);
            }

            System.out.println("\nÇift Sayılar (büyükten küçüğe):");
            for (int ciftSayi : ciftSayilar) {
                System.out.println(ciftSayi);
            }

            // Her iki listede de 3'e tam bölünen sayıları bulup ekrana yazdırıyoruz
            System.out.println("\n3'e tam bölünen sayılar:");
            System.out.println("Tek Sayılar:");
            for (int tekSayi : tekSayilar) {
                if (tekSayi % 3 == 0) {
                    System.out.println(tekSayi);
                }
            }

            System.out.println("\nÇift Sayılar:");
            for (int ciftSayi : ciftSayilar) {
                if (ciftSayi % 3 == 0) {
                    System.out.println(ciftSayi);
                }
            }
        }
}
