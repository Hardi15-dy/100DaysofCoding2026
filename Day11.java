public class day11 {
    public static void main(String[] args) {
        // Penggunaan library Scanner untuk input data dari user
        java.util.Scanner input = new java.util.Scanner(System.in);


        // Memasukkan nama dari inputan keyboard user
        // kemudian menyimpan ke dalam variable nama
        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan umur anda: ");
        int umur = input.nextInt();

        System.out.printf("Nama anda adalah %s%nDan umur anda adalah %d tahun", nama, umur);
    }
}
