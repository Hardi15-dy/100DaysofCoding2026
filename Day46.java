import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        // Day 46
        // contoh Percabangan switch case

        // Cobtoh penerapan dalam membuat menu
        Scanner in = new Scanner(System.in);

        System.out.println("1. makanan \n2. minuman \n3. makanan penutup");
        System.out.print("Masukkan pilihan Anda (1-3) : ");
        int nilai = in.nextInt();

        System.out.println("\n====================================\n");
        switch (nilai) {
            case 1:
                System.out.println("1. nasi goreng \n2. bakso \n3. lalapan");
                break;

            case 2:
                System.out.println("1. Pop ice \n2. sara'ba \n3. Jus alpukat");
                break;

            case 3:
                System.out.println("1. pisang epe \n2. banana roll \n3. tela tela");

                break;

            default:
                System.out.println("Perhatikan angka yang anda masukkan!!!");
                break;
        }
    }
}
