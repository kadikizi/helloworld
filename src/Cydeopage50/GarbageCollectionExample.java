package Cydeopage50;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        GarbageCollectionExample obj1 = new GarbageCollectionExample(); // obj1 referansı oluşturuldu
        GarbageCollectionExample obj2 = new GarbageCollectionExample(); // obj2 referansı oluşturuldu

        obj1 = null; // obj1 referansı null olarak atandı, artık kullanılmayan bir nesne
        obj2 = null; // obj2 referansı null olarak atandı, artık kullanılmayan bir nesne

        // Bellekte artık kullanılmayan nesnelerin temizlenmesi için garbage collection çalıştırılır
        System.gc();
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage Collector çalıştı, artık kullanılmayan nesneler temizlendi.");
    }
    }
