package Cydeopage50;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private List<Product> stock;

    public Market() {
        stock = new ArrayList<>();
    }

    public void addProduct(Product product) {
        stock.add(product);
    }

    public void removeProduct(Product product) {
        stock.remove(product);
    }

    public void clearExpiredProducts() {
        List<Product> expiredProducts = new ArrayList<>();

        // Geçerlilik süresi dolmuş ürünleri tespit etme
        for (Product product : stock) {
            if (product.isExpired()) {
                expiredProducts.add(product);
            }
        }

        // Geçerlilik süresi dolmuş ürünleri kaldırma
        stock.removeAll(expiredProducts);
    }

    public static void main(String[] args) {
        Market market = new Market();

        // Ürünlerin eklenmesi
        market.addProduct(new Product("Elma", 5));
        market.addProduct(new Product("Muz", 7));
        market.addProduct(new Product("Portakal", 3));
        market.addProduct(new Product("Çilek", 2));

        // Geçerlilik süresi dolmuş ürünlerin temizlenmesi
        market.clearExpiredProducts();

        // Kullanılmayan ürünlerin garbage collection ile temizlenmesi (otomatik olarak gerçekleşir)

        // Geriye kalan ürünleri listeleme
        System.out.println("Marketteki ürünler:");
        for (Product product : market.stock) {
            System.out.println(product.getName());
        }
    }
}

class Product {
    private String name;
    private int expiryDays;

    public Product(String name, int expiryDays) {
        this.name = name;
        this.expiryDays = expiryDays;
    }

    public String getName() {
        return name;
    }

    public boolean isExpired() {
        // Geçerlilik süresi dolmuşsa true, aksi halde false döner
        // Burada basitçe her ürünün geçerlilik süresi dolmuş olarak kabul ediliyor
        return true;
    }
}
