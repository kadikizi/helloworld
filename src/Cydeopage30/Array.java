package Cydeopage30;

public class Array {
    public static void main(String[] args) {
        //Java'da "array" (dizi), aynı türdeki verileri tutmak için kullanılan bir veri yapısıdır.
        // Bir dizi, aynı tipteki öğeleri bir araya getirir ve bu öğelere indeksler aracılığıyla erişim sağlar.
        // İndeksler 0'dan başlar ve dizinin boyutu üzerinden erişilebilir.

        // Dizi tanımlama ve boyutunu belirleme
        int[] numbers = new int[5];

        // Değer atama
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Dizi değerlerini yazdırma
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
