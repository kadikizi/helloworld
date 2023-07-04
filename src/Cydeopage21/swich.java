package Cydeopage21;

public class swich {
    public static void main(String[] args) {

        //Java'da "switch" ifadesi, belirli bir değerin farklı durumlarla eşleştirilmesini sağlayan bir kontrol yapısıdır.
        // Bu kontrol yapısı, if-else ifadelerinin yerine kullanılabilir ve daha okunabilir bir şekilde kod yazmayı sağlar.

        int mevsim = 3; // Kullanıcıdan alınan mevsim değeri

        switch (mevsim) {
            case 1:
                System.out.println("Bahar mevsimi"); // Eğer mevsim değeri 1 ise bu kod bloğu çalışacak
                break;
            case 2:
                System.out.println("Yaz mevsimi"); // Eğer mevsim değeri 2 ise bu kod bloğu çalışacak
                break;
            case 3:
                System.out.println("Sonbahar mevsimi"); // Eğer mevsim değeri 3 ise bu kod bloğu çalışacak
                break;
            case 4:
                System.out.println("Kış mevsimi"); // Eğer mevsim değeri 4 ise bu kod bloğu çalışacak
                break;
            default:
                System.out.println("Geçersiz mevsim"); // Eğer mevsim değeri geçerli bir seçenek değilse bu kod bloğu çalışacak
                break;
        }


    }
}
