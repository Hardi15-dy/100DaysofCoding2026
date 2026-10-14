import java.util.Scanner;

public class day43 {
    public static void main(String[] args) {
        // Day 43
        // Program kelipatan 3,5 3 dan 5
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = s.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.printf("%d adalah angka kelipatan 5 dan kelipatan 3", angka);
        } else if (angka % 3 == 0) {
            System.out.printf("%d adalah angka kelipatan 3", angka);
        } else if (angka % 5 == 0) {
            System.out.printf("%d adalah angka kelipatan 5", angka);
        } else {
            System.out.printf("%d angka tersebut bukan kelipatan 3 dan 5", angka);
        }
    }
}
