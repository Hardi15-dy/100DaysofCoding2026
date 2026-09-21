public class day20 {
	public static void main(String[] args) {
		// Day 20
		// Mengubah data primitif ke data String

		int a = 27;
		Boolean b = true;
		Double d = 165.9;
		System.out.println("===== Sebelum diubah =====");
		System.out.println("tipe data int         : " + a);
		System.out.println("tipe data Boolean     : " + b);
		System.out.println("tipe data Double      : " + d);

		String x = String.valueOf(a);
		String xx = String.valueOf(b);
		String xxx = String.valueOf(d);

		System.out.println("\n");
		System.out.println("===== Setelah diubah =====");
		System.out.println("Ini int ke String       : " + x);
		System.out.println("Ini Boolean ke String   : " + xx);
		System.out.println("Ini Double ke String    : " + xxx);
	}
}
