package Cydeopage51;

import java.util.*;


    //ArrayList: Dinamik boyutlu bir dizi olarak düşünülebilir ve elemanlar ardışık bir şekilde tutulur.
    //LinkedList: İki yönlü bağlı liste olarak düşünülebilir ve elemanlar bağlı düğümler halinde tutulur.
    //HashSet: Benzersiz elemanları bir küme olarak tutar, sırasızdır ve her eleman yalnızca bir kez tutulabilir.
    //TreeMap: Anahtarları sıralı bir şekilde tutar ve bu anahtarlarla ilişkilendirilmiş değerlere hızlı erişim sağlar.

    public class VeriYapilariOrnek {
        public static void main(String[] args) {
            // ArrayList örneği
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Kırmızı");
            arrayList.add("Mavi");
            arrayList.add("Yeşil");

            System.out.println("ArrayList örneği:");
            for (String renk : arrayList) {
                System.out.println(renk);
            }

            // LinkedList örneği
            LinkedList<Integer> linkedList = new LinkedList<>();
            linkedList.add(10);
            linkedList.add(20);
            linkedList.add(30);

            System.out.println("\nLinkedList örneği:");
            for (Integer integer : linkedList) {
                System.out.println(integer);
            }

            // HashSet örneği
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add("Elma");
            hashSet.add("Armut");
            hashSet.add("Çilek");

            System.out.println("\nHashSet örneği:");
            for (String meyve : hashSet) {
                System.out.println(meyve);
            }

            // TreeMap örneği
            TreeMap<Integer, String> treeMap = new TreeMap<>();
            treeMap.put(3, "Üç");
            treeMap.put(1, "Bir");
            treeMap.put(2, "İki");

            System.out.println("\nTreeMap örneği:");
            for (Integer key : treeMap.keySet()) {
                System.out.println(key + " -> " + treeMap.get(key));
            }}}

