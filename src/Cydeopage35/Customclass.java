package Cydeopage35;

public class Customclass {
    public static void main(String[] args) {
        String name = "John";
        int age = 25;

        sayHello(name);
        int result = multiplyByTwo(age);

        System.out.println("Result: " + result);
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int multiplyByTwo(int number) {
        return number * 2;
    }
}