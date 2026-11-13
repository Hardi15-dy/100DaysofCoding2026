import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        // Day 73
        // Latihan: do while: Membuat Menu Berulang


        Scanner s = new Scanner(System.in);
        int pil;
        do {
            System.out.println("""
                    ===== MENU =====
                    1. Makanan
                    2. Minuman
                    3. Makanan penutup
                    4. keluar
                    """);
            System.out.print("Masukkan pulihan anda : ");
            pil = s.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("""
    
                                === TERSEDIA ===
                                Ayam
                                Nasi lalapan
                                Coto
                            """);
                    break;
                case 2:
                    System.out.println("""
    
                                === TERSEDIA ===
                                Cappucino
                                Mactha
                                Sara`ba
                            """);
                    break;
                case 3:
                    System.out.println("""
    
                                === TERSEDIA ===
                                Jalangkote
                                Jepa
                            """);
                    break;
                case 4:
                    System.out.println("""
                                KELUAR DARI PROGRAM
                            """);
                    break;
                default:
                    System.out.println("\nPeriksa pilihan anda!!!");
                    break;
            }
            System.out.println("\n\n=======================================\n");
            
        } while (pil != 4);
    }
}
