import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        // Day 58
        // Mencetak angka ganjil dari n-1 dan angka genap dari n-1

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan n : ");
        int n = in.nextInt();

        System.out.printf("Angka Genap dari %d sampai 1 : \n",n);
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }
        System.out.println("\n\n");
        System.out.printf("Angka Ganjil dari %d sampai 1 : \n",n);
        for (int y = n; y >= 1; y--) {
            if (y % 2 != 0) {
                System.out.print(y + "  ");
            }
        }
        System.out.println("\n\n");
    }
}
