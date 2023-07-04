package Cydeopage36;

public class Oopcgsmdegistir {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "555-1234");

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Phone Number: " + customer.getPhoneNumber());

        // Cep telefonunu güncelle
        customer.setPhoneNumber("555-5678");

        System.out.println("Updated Phone Number: " + customer.getPhoneNumber());
    }
}

