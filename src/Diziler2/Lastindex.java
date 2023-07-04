package Diziler2;

public class Lastindex {
    public static void main(String[] args) {

        //lastIndexOf yöntemi, bir String içinde belirli bir karakterin veya alt dizenin son bulunduğu indis numarasını döndürür.
        // Eğer belirtilen karakter veya alt dize mevcut değilse, -1 değerini döndürür.

        String str = "Merhaba Dünya";
        int sonIndis = str.lastIndexOf('a');
        System.out.println(sonIndis);




    }

}
