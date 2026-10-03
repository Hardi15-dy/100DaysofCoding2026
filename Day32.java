import java.util.Scanner;

public class day32Latihan {
    public static void main(String[] args) {
        //Day 32
        //Latihan kombinasikan operator
        Scanner in = new Scanner(System.in);


        //True false izin mengemudi
        System.out.print("Masukkan tahun lahir anda : ");
        int umur = in.nextInt();             
        in.nextLine();
        System.out.print("Sudah punya SIM apa belum(y/n) : ");
        String ktp = in.nextLine();

        int lahir = 2026 - umur;

        if (lahir >= 17 && ktp.equalsIgnoreCase("y")) {
            System.out.println("Anda sudah cukup umur dan punya SIM untuk mengemudi");

        }else {
            System.out.println("Untuk mengemudi, umur harus di atas atau 17 tahun dan mempunyai SIM : ");
        }
    }
}
