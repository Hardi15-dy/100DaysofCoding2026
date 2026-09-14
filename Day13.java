import java.util.Scanner;
/**
 * @author Hardyyyyyyyyy
 * soal5
 */

public class soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Day 13
        System.out.println("\n");

        System.out.print("Masukkan Nama Anda : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Umur Anda : ");
        byte umur = sc.nextByte();

        System.out.print("Masukkan Tinggi badan Anda : ");
        double tinggi = sc.nextDouble();

        System.out.print("Masukkan Berat badan Anda : ");
        float berat = sc.nextFloat();

        System.out.print("Masukkan Jenis kelamin Anda : ");
        char kelamin = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Masukkan No WA Anda : ");
        String no = sc.nextLine();
        System.out.println("\n");

        System.out.println("===== OUTPUT =====");
        System.out.println("Nama          : "+nama);
        System.out.println("Umur          : "+umur+"tahun");
        System.out.println("Tinggi        : "+tinggi+" cm");
        System.out.println("Berat         : "+berat+" kg");
        System.out.println("Jenis Kelamin : "+kelamin);
        System.out.println("NO WA         : "+no);
    }
}
