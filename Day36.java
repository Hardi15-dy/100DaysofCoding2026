import java.util.Scanner;

public class day36 {
    public static void main(String[] args) {
        //Day 36
        //latihan menentukan bilangan ganjil dan genap
        Scanner in = new Scanner(System.in);


        System.out.print("Masukkan bilangan : ");
        int bil = in.nextInt();

        if (bil % 2 == 0 ) {
            System.out.printf("Angka \"%d\" adalah bilangan Genap",bil);
        }else{
            System.out.printf("Angka \"%d\" adalah bilangan ganjil",bil);
        }
    }
}
