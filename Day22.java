public class day22 {
    public static void main(String[] args) {
        // Day 22
        // Latihan program untuk menukar 2 variabel

        
        int a = 10;
        int b = 20;

        System.out.println("variabel b Sebelum di ubah : " + b);
        System.out.println("variabel a Sebelum di ubah : " + a);

        b = b - a;
        a = b + a;

        System.out.println("\n===== Setelah diubah =====");
        System.out.println("variabel b Sudah di ubah : " + b);
        System.out.println("variabel a Sudah di ubah : " + a);
    }
}
