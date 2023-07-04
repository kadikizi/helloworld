package Cydeopage18;

public class iciceif {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 3;

        if (x > y) {
            System.out.println("x, y'den büyüktür.");

            if (x > z) {
                System.out.println("x, z'den büyüktür.");
            } else {
                System.out.println("x, z'den küçüktür.");
            }
        } else {
            System.out.println("x, y'den küçüktür.");
        }

    }
}
