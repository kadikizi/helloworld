package Myself;

public class Exarray {
    public static void main(String[] args) {
        int[] numbers = {3,1 ,64,53,22, 99,2,4,5, 75, }; // Örnek dizi

        int maxNumber = numbers[0]; // Başlangıçta en büyük sayıyı ilk eleman olarak kabul ediyoruz

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("En büyük sayı: " + maxNumber);
    }}

