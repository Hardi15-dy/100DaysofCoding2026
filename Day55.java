public class day55 {

    public static void main(String[] args) {
        // Day55
        // Keywoard continue, break, return

        //break -> menghentikan proses secara paksa
        System.out.println("===== Break =====");
        int i;
        for (i = 0; i <= 10;i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i+ ". Teks");
        }
        
        System.out.println("\n");
        
        //contunie -> melewati (diskip) satu putaran iterasi
        System.out.println("===== Continue =====");
        for (i = 0; i <= 10;i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i+ ". Teks");
            
        }
        
        System.out.println("\n");
        
        System.out.println("===== Return =====");
        //Return -> Mengembalikan nilai
        return;
    }
}
