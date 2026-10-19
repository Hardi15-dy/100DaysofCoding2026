import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        // Day 48
        // Membuat kalkulator menggunakan switch-case

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        double ap = in.nextDouble();

        System.out.print("Masukkan angka kedua : ");
        double ak = in.nextDouble();

        System.out.print("\n+\n-\nx\n/ \nangka anda ingin di apakan : ");
        char pil = in.next().charAt(0);

        switch (pil) {
            case '+':
                double hasil = ap + ak;
                System.out.printf("hasil dari angka %.2f + %.2f = %.2f", ap, ak, hasil);

                break;
            case '-':
                double hasil2 = ap - ak;
                System.out.printf("hasil dari angka %.2f - %.2f = %.2f", ap, ak, hasil2);

                break;
            case 'x':
                double hasil3 = ap * ak;
                System.out.printf("hasil dari angka %.2f x %.2f = %.2f", ap, ak, hasil3);

                break;
            case '/':
                double hasil4 = ap / ak;
                System.out.printf("hasil dari angka %.2f / %.2f = %.2f", ap, ak, hasil4);
                break;

            default:
                System.out.println("Tidak valid!!\nperhatikan inputan anda");
                break;
        }
    }
}
