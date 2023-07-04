package Cydeopage22;

import java.util.Scanner;

public class Scannerclass {
    public static void main(String[] args) {

        //Scanner sınıfı, Java'da kullanıcıdan girdi almak için kullanılan bir sınıftır.
        // Bu sınıf, kullanıcıdan veri okumak için farklı veri tiplerini destekler ve
        // bu verileri programınızda kullanmanıza olanak sağlar.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String ad = scanner.nextLine();

        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        System.out.println("Merhaba " + ad + "! " + yas + " yaşındasınız.");
    }
}
