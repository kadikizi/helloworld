package Cydeopage37;


public class Vehicle {
    private String brand;
    private String color;
    private int year;

    public Vehicle(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is stopping.");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }

    public void brake() {
        System.out.println("The vehicle is braking.");
    }
}

