package Cydeopage50;

    //Java'da enum kullanarak 30 Ağustos Cumartesi günü işe giren
    // birinin 6 aylık staj gününü hesaplamak için aşağıda bir örnek bulunmaktadır:

import java.time.LocalDate;

    public class StajHesaplamaENUM {

        public enum Gunler {
            PAZARTESI,
            SALI,
            CARSAMBA,
            PERSEMBE,
            CUMA,
            CUMARTESI,
            PAZAR
        }

        public static void main(String[] args) {
            LocalDate girisTarihi = LocalDate.of(2023, 8, 30); // 30 Ağustos 2023 tarihi (Cumartesi)
            LocalDate stajBitisTarihi = girisTarihi.plusMonths(6); // 6 ay sonra tarih hesaplanıyor

            Gunler haftaninIlkGunu = Gunler.CUMARTESI; // İşe başlama gününe göre haftanın ilk günü belirleniyor
            int stajGunSayisi = 0;

            LocalDate iterasyonTarihi = girisTarihi;
            while (iterasyonTarihi.isBefore(stajBitisTarihi)) {
                if (haftaninIlkGunu == Gunler.PAZAR) {
                    haftaninIlkGunu = Gunler.PAZARTESI;
                } else {
                    haftaninIlkGunu = Gunler.values()[haftaninIlkGunu.ordinal() + 1];
                }

                if (haftaninIlkGunu != Gunler.CUMARTESI && haftaninIlkGunu != Gunler.PAZAR) {
                    stajGunSayisi++;
                }

                iterasyonTarihi = iterasyonTarihi.plusDays(1);
            }

            System.out.println("Stajın " + stajGunSayisi + " iş günü sürer ve " + stajBitisTarihi + " tarihinde biter.");
        }
    }


