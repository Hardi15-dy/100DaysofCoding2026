import java.util.Arrays;

public class day87 {
    public static void main(String[] args) {
        // Day 87
        // Manipulasi data dalam array

        int[] nilai = { 67, 87, 59, 98, 99 };
        int max = nilai[0];
        int min = nilai[0];

        System.out.println("Data dalam array NILAI : ");
        System.out.println(Arrays.toString(nilai));

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("\n\n");
        System.out.println("Nilai tertinggi adalah = " + max);
        System.out.println("Nilai terendah adalah = " + min);

        System.out.println("\n\n=== SEBELUM DI URUT ===");
        System.out.println(Arrays.toString(nilai));

        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        System.out.println("\n\n=== SETELAH DI URUT ===");
        for (int i = 0; i < nilai.length; i++) {
            if (i == 0) {
                System.out.print("{");
            }
            System.out.print(nilai[i] + " ");
            
            if (i == nilai.length - 1) {
                System.out.print("\b}");
                
            }
        }
        System.out.println();
        nilai[0] = 60;

        System.out.println("\n\n=== SETELAH Remedial ===");
        System.out.println(Arrays.toString(nilai));

    }
}
