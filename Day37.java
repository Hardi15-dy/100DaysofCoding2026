import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        //Day 37
        //Menentukan bilangan positif,negatif, dan nol

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        int bil = in.nextInt();

        if (bil > 0 ) {
            System.out.printf("Bilangan %d adalah bilangan positif",bil);
        } else if (bil < 0) {
            System.out.printf("Bilangan %d adalah bilangan negatif",bil);
        }else {
            System.out.printf("Bilangan %d adalah bilangan nol",bil);
        }
    }
}
