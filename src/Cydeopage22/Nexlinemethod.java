package Cydeopage22;

import java.util.Scanner;

public class Nexlinemethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String ad = scanner.nextLine();

        System.out.print("Soyadınızı girin: ");
        String soyad = scanner.nextLine();

        System.out.println("Merhaba " + ad + " " + soyad + "!");
    }
    }

