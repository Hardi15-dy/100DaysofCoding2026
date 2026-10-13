import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        //Day 42
        //Menentukan gaji bersih

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Gaji anda : ");
        int gajipokok = in.nextInt();
        
        System.out.print("Masukkan tunjangan anda : ");
        int tunjangan = in.nextInt();

        System.out.print("Masukkan pajak : ");
        int pajak = in.nextInt();

        System.out.print("Masukkan iuran (seperti BPJS) : ");
        int iuran = in.nextInt();

        int gajiKotor = gajipokok + tunjangan;
        int potongan = pajak + iuran;
        int gajibersih = gajiKotor - potongan;

        System.out.println("==========================\n\n");

        System.out.printf("Gaji bersih anda adalah Rp%,d",gajibersih);
    }
}
