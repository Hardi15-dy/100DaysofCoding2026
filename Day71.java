public class day71 {
    public static void main(String[] args) {
        // Day 71
        // Membuat pola segitiga siku siku terbalik

        //Segitiga siku siku terbalik
        for (int i = 5; i >=1; i--) {
            
            for (int p = 1; p <= i; p++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
