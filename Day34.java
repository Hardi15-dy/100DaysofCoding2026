import java.util.Scanner;

public class day34 {
    public static void main(String[] args) {
        // Day 34
        // Percabangan (If else if else)
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan nama Anda : ");
        String nama = s.nextLine();
        System.out.print("Masukkan umur Anda : ");
        byte umur = s.nextByte();
        s.nextLine();
        System.out.print("Masukkan hoby Anda : ");
        String hoby = s.nextLine();

        System.out.println("""
                ====== Pilihan ======
                1. Tampilkan nama kamu
                2. Tampilkan umur kamu
                3. Tampilkan hoby kamu
                """);
        System.out.print("Masukkan pilihan anda (1-3) : ");
        int pil = s.nextInt();

        if (pil == 1) {
            System.out.println("Nama kamu adalah : " + nama);
        } else if (pil == 2) {
            System.out.println("Umur kamu adalah : " + umur);
        } else if (pil == 3) {
            System.out.println("Hoby kamu adalah : " + hoby);
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}
