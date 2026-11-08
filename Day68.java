import java.util.Scanner;

public class eval3_2 {
    public static void main(String[] args) {
        // Day 68
        // Latihan membuat akun login

        Scanner s = new Scanner(System.in);

        System.out.print("Buat Username : ");
        String user = s.nextLine();
        System.out.print("Buat Password : ");
        String pw = s.nextLine();
        int count = 0;

        System.out.println("===LOGIN===");
        while (true) {
            System.out.print("Username : ");
            String a = s.nextLine();
            System.out.print("Password : ");
            String b = s.nextLine();

            count++;

            if (a.equals(user) && b.equals(pw)) {
                System.out.println("Login berhasil! Selamat datang " + user);
                System.out.println();
                break;
            } else {
                System.out.println("Username atau password anda salah");
                System.out.println();
            }
        }
        System.out.println("Jumlah percobaan login : " + count);
    }
}
