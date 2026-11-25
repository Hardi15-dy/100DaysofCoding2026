public class day85 {
    public static void main(String[] args) {
        // Day 85
        // Menentukan angka minimal array


        int[] angka = {89, 56, 34, 99, 45};

        int indeks = 0;
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Nama indeks ke-" + i + " Adalah " + angka[i]);
        }

        int i = 0;
        int min = angka[0];
        for (i = 0; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
                indeks = i;
            }
        }
        System.out.println("\n\n");
        System.out.println("====================\n");
        System.out.println("Angka terendah berada di indeks ke-"+indeks+" Dengan nilai = "+min);
    }
}
