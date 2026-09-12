public class day12Latihan {
    public static void main(String[] args) {
        // Membuat biodata sederhana menggunakan input dari user(Scanner)
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Memasukkan nama, umur, alamat, dan whatsapp dari inputan keyboard user menggunakan Scanner
        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur anda: ");
        int umur = input.nextInt();

        System.out.print("Masukkan alamat anda: ");
        input.nextLine(); // Membersihkan buffer
        String alamat = input.nextLine();

        System.out.print("Masukkan whatsapp anda: ");
        String whatsapp = input.nextLine();

        System.out.println("\n============ Biodata Anda ============");
        System.out.printf("Nama%7s: %s%nUmur%7s: %d%nAlamat%5s: %s%nWhatsapp%3s: %s","" ,nama, "",umur,"",alamat,"", whatsapp);
    }
}
