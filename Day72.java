import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        // Day 72
        // Penjumlahan angka(Berhenti ketika menginput angka negatif)

        Scanner s = new Scanner(System.in);

        int total = 0;

        while (true) {
            System.out.print("Masukkan angka : ");
            int angka = s.nextInt();
            if (angka < 0) {
                break;
            }
            total += angka;
        }
        System.out.println(total);
    }
}
