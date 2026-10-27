import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        // Day 56
        // Mencetak angka 1 sampai n dan n - 1

        Scanner in = new Scanner(System.in);

        System.out.print("Ingin melooping dari angka 1 sampai berapa : ");
        int n = in.nextInt();
        
        System.out.println("Looping dari 1 sampai "+n);
        for (int i = 1 ; i <= n; i++) {
            System.out.print(i+"  ");
        }
        
        System.out.println("\n");
        
        System.out.printf("Looping dari %d sampai 1",n);
        System.out.println();
        for (int x = n ; x >= 1; x--) {
            System.out.print(x+"  ");
        }
    }
}
