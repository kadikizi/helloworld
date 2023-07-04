package Myself;

public class Homework {

    public static void main(String[] args) {

                String str1 = "hello";
                String str2 = "world";

                System.out.println(isSorted(str1)); // Çıktı: true
                System.out.println(isSorted(str2)); // Çıktı: false
            }

            public static boolean isSorted(String str) {
                for (int i = 0; i < str.length() - 1; i++) {
                    if (str.charAt(i) > str.charAt(i + 1)) {
                        return false;
                    }
                }
                return true;
            }}
