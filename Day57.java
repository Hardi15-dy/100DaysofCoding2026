import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        // Day 57
        // Mencetak angka genap ganjil dari 1 - n dan angka genap 1-n;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan N : ");
        int n = in.nextInt();

        System.out.println("Mencetak angka genap dari 1 sampai " + n);
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }
        System.out.println("\n\n");
        System.out.println("Mencetak angka ganjil dari 1 sampai " + n);
        for (int o = 1; o <= n; o++) {
            if (o % 2 != 0) {
                System.out.print(o + "  ");
            }
        }
        System.out.println("\n\n");
    }
}
