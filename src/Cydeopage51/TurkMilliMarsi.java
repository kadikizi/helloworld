package Cydeopage51;

import java.util.Collections;
import java.util.HashMap;

public class TurkMilliMarsi {
        public static void main(String[] args) {
            // Türk Milli Marşı metni
            String milliMarsiMetni = "Korkma, sönmez bu şafaklarda yüzen al sancak; \n" +
                    "Sönmeden yurdumun üstünde tüten en son ocak. \n" +
                    "O benim milletimin yıldızıdır, parlayacak; \n" +
                    "O benimdir, o benim milletimindir ancak. \n" +
                    "\n" +
                    "Çatma, kurban olayım çehreni ey nazlı hilâl! \n" +
                    "Kahraman ırkıma bir gül… ne bu şiddet bu celâl? \n" +
                    "Sana olmaz dökülen kanlarımız sonra helâl, \n" +
                    "Hakkıdır, Hakk’a tapan, milletimin istiklâl. \n" +
                    "\n" ;


            // Harfleri saymak için bir harita oluşturuyoruz
            HashMap<Character, Integer> harfTekrarSayilari = new HashMap<>();

            // Metni gezerek harfleri sayıyoruz
            for (char harf : milliMarsiMetni.toCharArray()) {
                if (Character.isLetter(harf)) {
                    harf = Character.toLowerCase(harf); // Büyük-küçük harf duyarsızlığı için küçük harfe çeviriyoruz
                    harfTekrarSayilari.put(harf, harfTekrarSayilari.getOrDefault(harf, 0) + 1);
                }
            }

            // En çok tekrar eden harf sayısını buluyoruz
            int enCokTekrarSayisi = Collections.max(harfTekrarSayilari.values());

            // En çok tekrar eden harfleri bulup ekrana yazdırıyoruz
            System.out.println("Türk Milli Marşı'nda en çok tekrar eden harfler:");
            for (char harf : harfTekrarSayilari.keySet()) {
                if (harfTekrarSayilari.get(harf) == enCokTekrarSayisi) {
                    System.out.println(harf + " -> " + enCokTekrarSayisi + " kez");
                }
            }
        }
    }

