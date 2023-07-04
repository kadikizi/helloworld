package Cydeopage31;

public class foreach {

    public static void main(String[] args) {
        //Dizi elemanlarını foreach döngüsü kullanarak yenilemek, her elemanı döngü içinde tek
        // tek işlemek veya değiştirmek anlamına gelir.
        // Foreach döngüsü, Java'da dizileri veya Iterable koleksiyonları dolaşmak için kullanılan bir döngü türüdür.

        int[] numbers = {1, 2, 3, 4, 59};

        // Dizi elemanlarını iki katına çıkarma
        for (int number : numbers) {
            number = number * 2;
        }

        // Yenilenmiş dizi elemanlarını yazdırma
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
