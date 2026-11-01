import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
        // Day 61
        // Mengalikan angka 1 sampai n
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int a = in.nextInt();

        int aa = 1;
        
        for (int i = 1; i <= a; i++) {
            aa *= i;
        }
        System.out.println(aa);
    }
}
