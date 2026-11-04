import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {
        // Day 64
        // Mencari bilangan faktorial
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka yang ingin di faktorial : ");
        int angka = in.nextInt();

        long hasil = 1;


        for (int i = 1; i <= angka; i++) {
            hasil *= i;
        }
        System.out.printf("Faktorial dari angka %d adalah %d",angka,hasil);
    }
}
