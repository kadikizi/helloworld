package Cydeopage35;

public class gettersetteter {
    public static void main(String[] args) {

    }
        //Java'da getter ve setter,
        // sınıfın private (özel) veri alanlarına erişmek ve bu alanları güncellemek için kullanılan metotlardır.
        // Getter metotları, bir sınıftaki private bir değişkenin değerini döndürürken,
        // setter metotları ise private bir değişkenin değerini ayarlamak için kullanılır.
        //Getter metotları, veri alanlarının değerlerine dışarıdan erişim sağlamak ve okuma işlemlerini gerçekleştirmek için kullanılır.

        class Person {
            private String name;
            private int age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                Object nevo;
                this.name = getName();
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            } }
        }

