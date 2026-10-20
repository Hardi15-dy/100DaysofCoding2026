import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        // Day 49
        // Belajar logika ternary
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai kamu : ");
        int nilai = in.nextInt();

        String status = (nilai >= 80) ? "Lulus" : "Tidak lulus";

        System.out.println("Anda "+status);
    }
}
