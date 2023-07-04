package Cydeopage21;

public class Swichtstaments {
    public static void main(String[] args) {
        //Java'da switch ifadesi, belirli bir değişkenin değerine göre farklı işlemlerin yapılmasını sağlayan bir kontrol yapısıdır.
        // Switch ifadesi,if-else if-else ifadesinden farklı olarak daha sade bir yapı sağlar ve
        // genellikle sabit değerlerin kontrolünde tercih edilir.

        int gun = 3;
        String gunAdi;

        switch (gun) {
            case 1:
                gunAdi = "Pazartesi";
                break;
            case 2:
                gunAdi = "Salı";
                break;
            case 3:
                gunAdi = "Çarşamba";
                break;
            case 4:
                gunAdi = "Perşembe";
                break;
            case 5:
                gunAdi = "Cuma";
                break;
            case 6:
                gunAdi = "Cumartesi";
                break;
            case 7:
                gunAdi = "Pazar";
                break;
            default:
                gunAdi = "Geçersiz gün";
                break;
        }

        System.out.println("Gün: " + gunAdi);





    }}
