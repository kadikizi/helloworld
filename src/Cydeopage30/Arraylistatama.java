package Cydeopage30;

public class Arraylistatama {
    public static void main(String[] args) {


        // En pahalı markayı yazdırma
        int[] markalar = {1500, 2500, 1800, 2000, 3000};

        int enPahaliMarka = markalar[0]; // Başlangıçta ilk markayı en pahalı olarak kabul ediyoruz

        for (int i = 1; i < markalar.length; i++) {
            if (markalar[i] > enPahaliMarka) {
                enPahaliMarka = markalar[i];
            }
        }

        System.out.println("En pahalı marka: " + enPahaliMarka);
    }
}

