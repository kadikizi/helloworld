package Myself;



    public class ToCharArrayExample {
        public static void main(String[] args) {
            String str = "Merhaba";

            char[] charArray = str.toCharArray();

            System.out.println("Karakter Dizisi:");
            for (char ch : charArray) {
                System.out.println(ch);
            }
        }
}
