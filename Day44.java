import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        // Day 44
        // PORGRAM MENENTUKAN PREDIKAT NILAI DENGAN IF ELSE

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama Anda : ");
        String nama = in.nextLine();

        System.out.print("Masukkan nilai Anda : ");
        int nilai = in.nextInt();


        if (nilai >= 80 && nilai <= 100) {
            System.out.printf("Predikat %s adalah : A", nama);
        } else if (nilai >= 60 && nilai <= 79) {
            System.out.printf("Predikat %s adalah : B", nama);
        } else if (nilai >= 40 && nilai <= 59) {
            System.out.printf("Predikat %s adalah : C", nama);
        } else if (nilai >= 20 && nilai <= 39) {
            System.out.printf("Predikat %s adalah : D", nama);
        } else {
            System.out.printf("Predikat %s sangat parah", nama);
        }
    }
}
