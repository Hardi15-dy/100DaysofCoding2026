import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int hasil = 1;
        for (int i = 1; i <= a; i++) {
            hasil *= i;
        }
        System.out.println(hasil);
    }
}
