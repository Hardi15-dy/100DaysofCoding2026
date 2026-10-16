import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        // Day 45
        // Percabangan switch case

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        switch (a) {
            case 1:
            System.out.println("Anda memilih case 1");
            break;
            
            case 2:
                System.out.println("Anda memilih case 2");

                break;
            default:
                System.out.println("Periksa pilihan anda");
                break;
        }
    }
}
