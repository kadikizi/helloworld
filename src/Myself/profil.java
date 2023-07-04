package Myself;

import java.util.Scanner;

public class profil {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("lürfen bir isim girin");
        String girilenisim = scanner.nextLine();
        System.out.println("lğtfensoyismizigiriniz");
        String girilensoyisim = scanner.nextLine();
        System.out.println("lütfen yasınızıgiriniz");
        int girilenyas=scanner.nextInt();
        System.out.println("isminiz:+girilenisim");
        System.out.println("soyisminiz+girilensoyisim");
        System.out.println("yaş+girilenyaş");
        System.out.println("kaydınız alındı");
    }
}
