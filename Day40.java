import java.util.Scanner;

public class bioskop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan umur penonton : ");
        int umur = s.nextInt();
        System.out.print("Apakah mahasiswa? : ");
        boolean mahasiswa = s.nextBoolean();
        double harga = 0;

        if (umur < 12) {
            harga = 30000;
        } else if (umur >=12 && umur <= 18) {
            harga = 40000;
        } else {
            harga = 50000;
        }
        
        if (mahasiswa) {
            double harga1 = harga - ((20.0 / 100.0)* harga);
            System.out.printf("Harga tiket sebelum diskon : Rp%.0f\n",harga);
            System.out.println("Diskon mahsiwa 20%");
            System.out.printf("Total bayar : Rp%.0f\n",harga1);
        } else{
            System.out.printf("Total bayar : Rp%.0f",harga);
        }

    }
}
