import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        //Day 38
        //membuat menu dengan if else

            
            String kondisi = " ";
            
            do {
                kondisi = " ";
                Scanner in = new Scanner(System.in);
                String menu[] = { "Mie goreng", "Ayam", "Bakso" };
                int harga[] = { 10000, 25000, 15000 };
        
                System.out.printf("=====  MENU  ======%n");
                for (int i = 0; i < menu.length; i++) {
                    System.out.printf("%d. %s dengan harga %,d %n", (i + 1), menu[i], harga[i]);
                }
                System.out.printf("================================%n%n%n");
                System.out.printf("Masukkan pilihan 1-3 : ");
                int pil = in.nextInt();
                in.nextLine();
                
                if (pil < 1 || pil > 3) {
                    System.out.printf("Error, periksa pilihan anda");
                } else {
                    System.out.printf("================================%n%n");
                    System.out.printf("Masukkan porsi : ");
                    int porsi = in.nextInt();
                    in.nextLine();
                    
                    if (porsi <= 0) {
                        System.out.printf("Porsi harus lebih dari 0!!");
                    } else {
                        String menuPilihan = menu[pil - 1];
                        int hargaPilihan = harga[pil - 1];
        
                        int hasil = porsi * hargaPilihan;
                        System.out.printf("=======  NOTA  =======%n%n");
                        System.out.printf("Anda Memesan %s %,d /porsi %n", menu[pil - 1], harga[pil - 1]);
                        System.out.printf("Anda memesan %d porsi%n", porsi);
                        System.out.printf("Harga total Rp %,d %n", hasil);
                    }
                }
                System.out.print("\n\nUlang atau tidak : ");
                kondisi = in.nextLine();
            } while (kondisi.equalsIgnoreCase("ulang"));
    }
}
