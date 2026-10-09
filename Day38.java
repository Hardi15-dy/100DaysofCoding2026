import java.util.Scanner;

public class day38_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("""
                ===== MENU =====
                1. Menu 1
                2. Menu 2
                3. Menu 3

                silahkan pilih menu anda :
                """);
        int a = s.nextInt();

        if (a == 1) {
            System.out.println("Anda memilih menu Pertama");
        } else if (a == 2) {
            System.out.println("Anda memilih menu Kedua");
        } else if (a == 3) {
            System.out.println("Anda memilih menu Ketiga");
        }
    }
}
