import java.util.Scanner;
public class nilaiAkhir {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int mtk,ddp,pkn;
		
        // ini adalah program untuk menghitung nilai akhir dari 3 mata kuliah
		System.out.printf("Masukkan nilai MK mtk : ");
		mtk = in.nextInt();
		
		System.out.printf("Masukkan nilai MK ddp : ");
		ddp = in.nextInt();
		
		System.out.printf("Masukkan nilai MK pkn : ");
		pkn = in.nextInt();
		
        /*
         * Menghitung nilai akhir berdasarkan bobot masing-masing mata kuliah
         */
		double h = mtk * 30.0 / 100;
		double h2 = ddp * 40.0 / 100;
		double h3 = pkn * 30.0 / 100;
		
		double total = h + h2 + h3;
		
        /**
         * Menampilkan hasil perhitungan nilai akhir          
         * */
		System.out.printf("dengan mengambil%nnilai 30%% dari mtk%nnilai 40%% dari ddp%nnilai 30%% dari pkn ");
		
		System.out.printf("%n%n%nNilai akhir kamu adalah %.2f",total);
	}
}
