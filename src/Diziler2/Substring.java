package Diziler2;

public class Substring {
    public static void main(String[] args) {
        //substring bir String nesnesi üzerinde bir bölümünü almak için kullanılan bir yöntemdir.

        // Bu yöntem, bir başlangıç indisini ve isteğe bağlı olarak bir bitiş indisini parametre olarak alır ve belirtilen indisler arasındaki alt dizeyi döndürür.

        String str = "Merhaba Dünya";

        String altDize = str.substring(8);
        System.out.println(altDize); // Çıktı: Dünya

    }



}
