package Cydeopage51;


    import java.util.LinkedList;

    public class LinkedListOrnegi {
        public static void main(String[] args) {
            // LinkedList oluşturma
            LinkedList<String> isimler = new LinkedList<>();

            // Verileri ekleme
            isimler.add("Ayşe");
            isimler.add("Nesrin");
            isimler.add("Burak");
            isimler.add("Betül");
            isimler.add("Yunus");

            // Verilere erişim ve ekrana yazdırma
            System.out.println("LinkedList örneği:");
            for (String isim : isimler) {
                System.out.println(isim);
            }

            // İlk ve son elemanları alıp yazdırma
            System.out.println("\nİlk eleman: " + isimler.getFirst());
            System.out.println("Son eleman: " + isimler.getLast());

            // Belirli bir indexteki elemanı alma
            int index = 2;
            if (index >= 0 && index < isimler.size()) {
                System.out.println("\n" + index + ". indexteki eleman: " + isimler.get(index));
            } else {
                System.out.println("\nGeçersiz index.");
            }

            // Bir elemanı listeden silme
            String silinecekIsim = "Betül";
            if (isimler.remove(silinecekIsim)) {
                System.out.println("\n" + silinecekIsim + " ismi listeden silindi.");
            } else {
                System.out.println("\n" + silinecekIsim + " ismi listede bulunamadı.");
            }

            // LinkedList'in boyutunu alma
            System.out.println("\nLinkedList boyutu: " + isimler.size());
        }
    }

