import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        //Day 25
		//menghitung luas lingkaran
		Scanner in = new Scanner (System.in);
		
		int jj;
		
		System.out.print("Masukkan jari jari lingkaran : ");
		jj = in.nextInt();
		
		if (jj % 7 == 0 ) {
			// Rumus luas lingkaran = 22 / 7 * jari jari pangkat 2 (Jari jarinya kelipatan 7)
			double luas = (jj*jj)* 22 / 7 ;
			System.out.printf("jadi luas lingkaran dengan jari-jari %dcm%nAdalah : %.2fcm",jj,luas);
		}else {
			// Rumus luas lingkaran = 3.14 * jari jari pangkat 2 (Jari jarinya bukan kelipatan 7)
			double luas = 3.14 * (jj*jj);
			System.out.printf("jadi luas lingkaran dengan jari-jari %dcm%nAdalah : %.2fcm",jj,luas);
		}
    }
}
