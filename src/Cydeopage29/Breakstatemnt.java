package Cydeopage29;

public class Breakstatemnt {
    public static void main(String[] args) {
        //break ifadesi, bir döngü veya switch-case bloğu içerisinde bulunduğu anda,
        // o bloktan anında çıkarak döngüyü veya switch-case bloğunu sonlandıran bir kontrol ifadesidir.

        for (int i = 1; i <= 10; i++) {
            System.out.println("Sayı: " + i);

            if (i == 5) {
                break;
            }
        }

    }
}
