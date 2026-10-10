import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        // Day 39
        // Membuat kalkulator menggunakan if else

        Scanner in = new Scanner(System.in);

        System.out.println("bilangan anda ingin di apakan?");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilih (1-4) : ");
        int pil = in.nextInt();
        in.nextLine();

        if (pil == 1) {
            System.out.print("Masukkan bilangan Anda : ");
            int bil1 = in.nextInt();
            in.nextLine();
            System.out.print("Di tambah berapa : ");
            int bil2 = in.nextInt();
            in.nextLine();

            int hasil = bil1 + bil2;
            System.out.printf("Jumlah dari bilangan %d + %d = %d", bil1, bil2, hasil);
        } else if (pil == 2) {
            System.out.print("Masukkan bilangan Anda : ");
            int bil1 = in.nextInt();
            in.nextLine();
            System.out.print("Di kurang berapa : ");
            int bil2 = in.nextInt();
            in.nextLine();

            int hasil = bil1 - bil2;
            System.out.printf("Jumlah dari bilangan %d - %d = %d", bil1, bil2, hasil);
        } else if (pil == 3) {
            System.out.print("Masukkan bilangan Anda : ");
            int bil1 = in.nextInt();
            in.nextLine();
            System.out.print("Di kali berapa : ");
            int bil2 = in.nextInt();
            in.nextLine();

            int hasil = bil1 * bil2;
            System.out.printf("Jumlah dari bilangan %d x %d = %d", bil1, bil2, hasil);

        } else if (pil == 4) {
            System.out.print("Masukkan bilangan Anda : ");
            double bil1 = in.nextDouble();
            in.nextLine();
            System.out.print("Di bagi berapa : ");
            double bil2 = in.nextDouble();
            in.nextLine();

            if (bil2 <= 0) {
                System.out.println("Error");
            } else {
                double hasil = bil1 / bil2;
                System.out.printf("Jumlah dari bilangan %.2f / %.2f = %.2f", bil1, bil2, hasil);
            }

        } else {
            System.out.println("PERIKSA KEMBALI PILIHAN ANDA");
        }
    }
}
