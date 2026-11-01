import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
        // Day 62
        // Nested Loop (Loop bersarang)
        Scanner s = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
