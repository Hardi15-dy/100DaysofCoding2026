public class day79 {
    public static void main(String[] args) {
        // Day79
        // Array 1 Dimensi

        String[] nama = new String[3];

        nama[0] = "Hardy";
        nama[1] = "Coding";
        nama[2] = "Java";

        // Cara agar lebih efisien memanggil isi array
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Kalimat indeks ke-" + i + " Adalah " + nama[i]);
        }
    }
}
