import java.util.Scanner;

public class final1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();


        System.out.println("Berhasil di tarik       : Rp"+(b/100000*100000));
        System.out.println("jumlah lembar Rp100000  : "+(b/100000));
        System.out.println("Gagal ditarik           : Rp"+(b % 100000));

    }
}
