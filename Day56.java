import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        // Day 56
        // Mencetak angka 1 sampai n dan n - 1

        Scanner in = new Scanner(System.in);

        System.out.print("Ingin melooping dari angka 1 sampai berapa : ");
        int n = in.nextInt();
        
        System.out.println("Looping dari a sampai "+n);
        for (int i = 0 ; i <= n; i++) {
            System.out.print(i+"  ");
        }
        
        System.out.println("\n");
        System.out.print("Ingin melooping dari angka 1 sampai berapa : ");
        int b = in.nextInt();
        
        System.out.printf("Looping dari 0 sampai %d",b);
        System.out.println();
        for (int x = 0 ; x >= b; x--) {
            System.out.print(x+"  ");
        }
    }
}
