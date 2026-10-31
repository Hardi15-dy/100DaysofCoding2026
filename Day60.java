import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        // Day 60
        // Menjumlahkan angka 1 sampai n
        Scanner s = new Scanner(System.in);

        // System.out.print("Masukkan angka ke-1 : ");
        int n = s.nextInt();
        int hasil = 0;

        for (int i = 1; i <= n; i++) {
            hasil += i;
        }
        System.out.println(hasil);
    }
}
