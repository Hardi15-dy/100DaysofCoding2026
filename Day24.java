import java.util.Scanner;

public class day24 {
	public static void main(String[] args) {
		// Day 24
		// Mencari luas persegi panjang
		Scanner in = new Scanner(System.in);

		int panjang, lebar, luas;

		// memasukkan value dari variabel
		System.out.print("Masukkan panjang : ");
		panjang = in.nextInt();
		System.out.print("Masukkan lebar : ");
		lebar = in.nextInt();

		// Rumus mencari luas persegi panjang
		luas = panjang * lebar;

		// Memunculkan hasil kelayar
		System.out.printf("Jadi luas persegi panjang%ndengan panjang %dcm, dan lebar %dcm adalah%nLuas = %d cm",panjang, lebar, luas);
	}
}
