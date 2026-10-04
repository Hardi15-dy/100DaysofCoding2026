import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        //Day 33
        //Percabangan if-else
            Scanner in = new Scanner(System.in);

        int umur;

        System.out.print("Masukkan umur anda : ");
        umur = in.nextInt();

        if (umur >= 18) {
            System.out.println("Anda Dewasa");
        }else{
            System.out.println("Anda Belum dewasa");
        }
    }
}
