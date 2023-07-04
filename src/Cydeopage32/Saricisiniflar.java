package Cydeopage32;
public class Saricisiniflar {
    public static void main(String[] args) {
        //Bu örnek kodda, swap adlı bir yöntem kullanılmıştır.
        // Bu yöntem, bir tür parametresi (<T>) alan genel bir yöntemdir.
        // Bu sayede, farklı veri türleri üzerinde aynı işlemi gerçekleştirebilirsiniz.
        // İlk olarak, tamsayı dizisi (intArray) üzerinde örneklendirilmiştir.
        // Ardından, karakter dizisi (charArray) ve dize dizisi (stringArray) üzerinde de kullanılmıştır.
        // Bu yöntem, her bir dizideki belirtilen indekslerdeki öğeleri takas eder.
        int[] intArray = {10, 20, 30, 40, 50};
        
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        // Çıktı: 10 20 50 40 30

        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        swap(charArray, 1, 3);
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        // Çıktı: A D C B E

        String[] stringArray = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        // Çıktı: Elderberry Banana Cherry Date Apple
    }

    private static void swap(char[] charArray, int i, int i1) {
    }}
