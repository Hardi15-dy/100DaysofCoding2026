import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        // Day 63
        // Mencetak hasil m pangkat n

        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= m;
            System.out.println("hasil perkalian ke-"+i+" : "+hasil);
        }
        System.out.println();
        System.out.printf("Hasil dari %d pangkat %d = %,d\n", m, n, hasil);

        in.close();
    }
}
