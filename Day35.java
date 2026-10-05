import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        //Day 35
        //nested if atau if bersarang
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan umur anda : ");
        int umur = in.nextInt();
        in.nextLine();

        System.out.print("Apakah anda mempunyai SIM? (y/n) : ");
        String sim = in.nextLine();

        if (umur >= 18) {
            System.out.println("Anda sudah cukup umur untuk mengemudi");
            if (sim.equalsIgnoreCase("y")) {
                System.out.println("Anda memiliki izin untuk mengemudi");
            }else{
                System.out.println("Tapi anda belum memnpunyai sim untuk izin berkendara");
            }
        }else{
            System.out.println("Anda belum cukup umur untuk mengemudi");
        }
    }
}
