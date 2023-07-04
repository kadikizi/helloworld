package Cydeopage28;

public class Nestedloop {
    public static void main(String[] args) {
        //Nested loop (iç içe döngü), bir döngünün içerisinde başka bir döngünün bulunması durumudur.
        // Bu şekilde, iç içe geçmiş döngüler kullanılarak daha karmaşık tekrarlı işlemler gerçekleştirilebilir.

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("Dış Döngü: " + i + ", İç Döngü: " + j);
            }
        }





    }
}
