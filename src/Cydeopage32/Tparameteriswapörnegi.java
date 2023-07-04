package Cydeopage32;
public class Tparameteriswapörnegi {
    public static void main(String[] args) {
        //Bu örnek kodda, swap adlı bir yöntem tanımlanmıştır.
        // Bu yöntem, bir tamsayı dizisi (arr), birinci indeks (i) ve ikinci indeks (j) parametrelerini alır.
        // İndeksleri kullanarak, dizi üzerindeki öğelerin yerlerini değiştirir.

        int[] array = {10, 20, 30, 40, 50};
        swap(array, 2, 4);
        // Diziyi yazdırma
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Çıktı: 10 20 50 40 30
    }

    private static void swap(int[] array, int i, int i1) {
    }
}
