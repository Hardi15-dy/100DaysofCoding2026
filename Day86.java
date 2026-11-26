public class day86 {
    public static void main(String[] args) {
        // Day 86
        // Mencari elemen dalam Array

        int[] nilai = { 46, 32, 56, 76, 55 };
        boolean tidak = false;

        System.out.println("===== Nilai dalam Array =====");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nama indeks ke-" + i + " Adalah " + nilai[i]);
        }

        System.out.println("====================================");
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == 55) {
                tidak = true;

                System.out.println(
                        "Target " + 55 + " ditemukan pada indeks " + i + " dengan nilai = " + nilai[i]);

                break;
            } else {
                tidak = false;
            }
        }

        if (tidak == false) {
            System.out.println("Data tidak di temukan di indeks manapun!!!");
        }
    }
}
