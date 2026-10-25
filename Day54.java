import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        // Day 54
        // Hasil penjummlahan dari 1 sampai n
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int hasil = 0;
        for (int i = 0; i <= a; i++) {
            hasil += i;
        }
        System.out.println(hasil);
    }
}
