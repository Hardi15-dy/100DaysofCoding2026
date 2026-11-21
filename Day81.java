public class day81 {
    public static void main(String[] args) {
        // Day 81
        // memunculkan nilai indeks array menggunakan perulangan

        String[] nama = new String[3];

        nama[0] = "Hardy";
        nama[1] = "Informatika";
        nama[2] = "Kelas b";

        // perulangan for
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Isi indeks ke-" + i + " Adalah " + nama[i]);
        }
    }
}
