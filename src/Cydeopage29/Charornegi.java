package Cydeopage29;

import java.util.Scanner;

public class Charornegi {
    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.print("Bir harf girin (a ile çıkış yapın): ");
                    char karakter = scanner.next().charAt(0);

                    if (karakter == 'a') {
                        System.out.println("Programdan çıkılıyor...");
                        break;
                    }

                    System.out.println("Girilen harf: " + karakter);
                }

                scanner.close();
            }
}
