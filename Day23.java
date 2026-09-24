iimport java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        //Day 23
		//Mencari luas persegi
		Scanner in = new Scanner(System.in);
		
		int sisi,luas;
		
		System.out.print("Masukkan sisi : ");
		sisi = in.nextInt();
		in.nextLine();
		
		//Rumus mencari luas persegi yaitu L = sisi × sisi
		luas = sisi*sisi;
		
		System.out.printf("Jadi luas dari persegi%ndengan sisi %dcm adalah : %dcm",sisi,luas);
    }
}
