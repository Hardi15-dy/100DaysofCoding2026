import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        // Day59
        // Mencetak bilangan keliapatan m dari 1 sampai n
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka m : ");
        int m = in.nextInt();

        System.out.printf("Masukkan sampai angka berapa angka kelipatan %d di cetak : ",m);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i + "  ");
            }
        }
        System.out.println("\n\n");
    }
}
