public class day84 {
    public static void main(String[] args) {
        // Day 84
        // Menentukan angka maksimal array

        int[] angka = {89, 56, 34, 99, 45};

        int indeks = 0;
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Nama indeks ke-" + i + " Adalah " + angka[i]);
        }

        int i = 0;
        int max = angka[0];
        for (i = 0; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
                indeks = i;
            }
        }
        System.out.println("\n\n");
        System.out.println("====================\n");
        System.out.println("Angka tertinggi berada di indeks ke-"+indeks+" Dengan nilai = "+max);
    }
}
