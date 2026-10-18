import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        // Day 47
        // Program untuk menentukan hari
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka untuk menentukan hari(1-7) : ");
        int hari = in.nextInt();

        switch (hari) {
            case 1:
                System.out.printf("Hari ke %d adalah hari Senin", hari);
                break;

            case 2:
                System.out.printf("Hari ke %d adalah hari Selasa", hari);

                break;
            case 3:
                System.out.printf("Hari ke %d adalah hari Rabu", hari);

                break;
            case 4:
                System.out.printf("Hari ke %d adalah hari Kamis", hari);

                break;
            case 5:
                System.out.printf("Hari ke %d adalah hari Jumat", hari);

                break;
            case 6:
                System.out.printf("Hari ke %d adalah hari Sabtu", hari);

                break;
            case 7:
                System.out.printf("Hari ke %d adalah hari Minggu", hari);

                break;
            default:
                System.out.println("Hari tidak valid, periksa angka anda");
                break;
        }
    }
}
