package Cydeopage18;

public class Fatmanesrin {
    public static void main(String[] args) {
       //Bu örnekte, verilen üç kişinin yaşları nesrin, ayse ve fato değişkenlerine atanmıştır. Ardından,
        // iç içe if ifadeleriyle bu yaşları karşılaştırarak en büyük yaşa sahip kişiyi bulup sıralama yapılmıştır. İlk if bloğu, nesrinin en büyük olduğu durumu kontrol eder.
        // İkinci if bloğu, aysenin en büyük olduğu durumu kontrol eder. Son if bloğu ise fatonun en büyük olduğu durumu kontrol eder.
        //Sonuç olarak, en büyük yaşa sahip kişi en üstte, en küçük yaşa sahip kişi en altta olacak şekilde büyükten küçüğe doğru sıralama yapılarak sonuçlar
        // ekrana yazdırılır.



        int nesrin = 35;
        int ayse = 99;
        int fato = 45;

        if (nesrin > ayse && nesrin > fato) {
            if (ayse > fato) {
                System.out.println("En büyük yaş: " + nesrin);
                System.out.println("Orta yaş: " + ayse);
                System.out.println("En küçük yaş: " + fato);
            } else {
                System.out.println("En büyük yaş: " + nesrin);
                System.out.println("Orta yaş: " + fato);
                System.out.println("En küçük yaş: " + ayse);
            }
        } else if (ayse > nesrin && ayse > fato) {
            if (nesrin > fato) {
                System.out.println("En büyük yaş: " + ayse);
                System.out.println("Orta yaş: " + nesrin);
                System.out.println("En küçük yaş: " + fato);
            } else {
                System.out.println("En büyük yaş: " + ayse);
                System.out.println("Orta yaş: " + fato);
                System.out.println("En küçük yaş: " + nesrin);
            }
        } else {
            if (nesrin > ayse) {
                System.out.println("En büyük yaş: " + fato);
                System.out.println("Orta yaş: " + nesrin);
                System.out.println("En küçük yaş: " + ayse);
            } else {
                System.out.println("En büyük yaş: " + fato);
                System.out.println("Orta yaş: " + ayse);
                System.out.println("En küçük yaş: " + nesrin);
            }
        }



    }
}
