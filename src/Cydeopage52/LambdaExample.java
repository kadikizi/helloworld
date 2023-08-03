package Cydeopage52;


    import java.util.Arrays;

    public class LambdaExample {


        public static void main(String[] args) {
            int[] numbers = {1, 78, 56, 58, 458, 963, 457, 8428, 6, 7, 8, 9};

            // Lambda ifadesi ile dizideki tüm sayıları ekrana yazdırma
Arrays.stream(numbers).filter(i->i<10).forEach(System.out::println);
            System.out.println(1+78+56+458+963+457+963);  Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
        }
    }
//Lambda ifadesinin yararları şunlardır:
//Daha az kod yazma: Lambda ifadeleri, kısa ve öz bir şekilde fonksiyonel arayüzleri kullanarak kodu azaltır.
//Okunabilirlik: Lambda ifadeleri, işlevi açık bir şekilde belirterek kodun daha okunabilir olmasını sağlar.
//Fonksiyonları geçmek için kullanım: Lambda ifadeleri, metodlara parametre olarak veya
// fonksiyonel arayüzleri kullanan metodlarda kullanılarak kodun daha esnek ve genişletilebilir olmasını sağlar.
//Concurrent (paralel) programlama: Lambda ifadeleri, Java 8'de tanıtılan Stream API ile birleştirilerek, paralel işlemler yapmak için kolaylık sağlar.
//Özetle, Lambda ifadeleri, Java programlama diline daha fonksiyonel programlama özellikleri eklemek için kullanılır ve daha esnek, sade ve okunabilir kod yazmayı sağlar.


