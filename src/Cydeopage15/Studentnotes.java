package Cydeopage15;

public class Studentnotes {
    public static void main(String[] args) {
        int mat=55;
        int fen=62;
        int hayat=88;
       int ortalama = (mat+fen+hayat)/3;

        if (ortalama >=75) {

            System.out.println("ögrenci geçti");
        } else {
            System.out.println("ögrenci kaldı");
        }
    }
}
