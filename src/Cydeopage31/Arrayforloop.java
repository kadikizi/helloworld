package Cydeopage31;

public class Arrayforloop {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 3, 4, 530};

        // Dizi elemanlarını iki katına çıkarma
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        // Yenilenmiş dizi elemanlarını yazdırma
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
