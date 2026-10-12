import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        // Day 41
        // Menentukan temperatur ruanan menggunakan if

        String ulangi = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Suhu : ");
        int suhu = in.nextInt();

        if (suhu < 18) {
            System.out.println("Suhu ruangan Dingin");
            ulangi = in.nextLine();
        } else if (suhu >= 18 && suhu <= 24) {
            System.out.println("Suhu ruangan Sejuk");
            ulangi = in.nextLine();
        } else if (suhu >= 25 && suhu <= 29) {
            System.out.println("Suhu ruangan Normal");
            ulangi = in.nextLine();
        } else if (suhu >= 30 && suhu <= 34) {
            System.out.println("Suhu ruangan Hangat");
            ulangi = in.nextLine();
        } else {
            System.out.println("Suhu ruangan Panas");
        }
    }
}
