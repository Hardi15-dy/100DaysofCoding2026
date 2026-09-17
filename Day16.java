public class day16 {
    public static void main(String[] args) {
        // Day 16
        // Opertator aritmatika modulus atau sisa bagi
        int a = 20;
        int b = 10;
        int hasil = a % b;
        System.out.printf("Nilai hasil modulus %d %% %d : %d%n",a,b, hasil);
        int hasil2 = b % a;
        System.out.printf("Nilai hasil modulus %d %% %d : %d%n",b,a, hasil2);
    }
}
