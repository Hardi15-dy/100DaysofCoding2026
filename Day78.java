import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        // Day 78
        // Membuat akun dan login ke akun(Menggunakan loop berhenti ketika user dan
        // password benar)

        Scanner in = new Scanner(System.in);

        boolean kondisi = true;
        // Membuat akun
        System.out.print("Masukkan username anda : ");
        String username = in.nextLine();

        System.out.print("Masukkan Password anda : ");
        String pw = in.nextLine();

        System.out.println("=== SELAMAT AKUN ANDA TELAH DI BUAT ===\n");

        do {
            // login ke akun
            System.out.print("Masukkan username anda untuk login : ");
            String username2 = in.nextLine();
            System.out.print("Masukkan password anda untuk login : ");
            String pw2 = in.nextLine();

            if (username2.equals(username) && pw2.equals(pw)) {
                System.out.println("Selamat anda telah login");
                kondisi = true;
            } else if (!username2.equals(username) && !pw2.equals(pw)) {
                System.out.println("Username dan Passwod salah!!!");
                kondisi = false;
            } else if (!username2.equals(username) || pw2.equals(pw)) {
                System.out.println("Username salah!!!");
                kondisi = false;
            } else if (username2.equals(username) || !pw2.equals(pw)) {
                System.out.println("Password salah!!!");
                kondisi = false;
            }
        } while (kondisi == false);
    }
}
