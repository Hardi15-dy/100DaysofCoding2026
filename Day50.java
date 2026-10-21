import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        // Day 50
        //membuat program ganjil genap menggunakan operator ternary
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan angka : ");
        int angka = in.nextInt();

        String a = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.printf("%d adalah bilangan %s",angka,a);
    }
}
