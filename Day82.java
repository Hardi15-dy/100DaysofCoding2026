import java.util.Scanner;

public class day82 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int n = s.nextInt();
        int [] angka = new int[n];


        for (int i = 0; i < n; i++) {
            angka[i] = s.nextInt();
        }

        int tinggi = angka[0];

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > tinggi) {
                tinggi = angka[i];
            }
        }
        System.out.println(tinggi);
    }
}
