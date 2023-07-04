package Diziler2;

public class Isblank {
    public static void main(String[] args) {
        //isBlank yöntemi, bir String'in boş veya yalnızca boşluklardan oluşup oluşmadığını kontrol etmek için kullanılır.
        // Bu yöntem, String'in içeriğinde herhangi bir karakterin olup olmadığını değil,
        // yalnızca boşluklardan oluşup oluşmadığını kontrol eder.

        String str1 = "";
        String str2 = "   ";
        String str3 = "Merhaba";

        System.out.println(str1.isBlank()); // true
        System.out.println(str2.isBlank()); // true
        System.out.println(str3.isBlank()); // false





    }
}
