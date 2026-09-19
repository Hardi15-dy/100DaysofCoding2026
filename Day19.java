public class day19 {
    public static void main(String[] args) {
        //Day 19
		//Konversi manual/paksa(Dari tipe data besar ke kecil)
		
		double d = 13.4598398759387983278943787;
		float f = (float) d;

		long l = 2893572938742343687l;
		int i = (int) l;
		short s =(short) i;
		byte b = (byte)i;
		
		System.out.println("===== Bilangan desimal =====\n");
		System.out.println("Doube          : "+d);
		System.out.println("Doube ke Float : "+f);


		System.out.println("\n\n===== Bilangan bulat =====\n");
		System.out.printf("Long           : %d %n",l);
		System.out.printf("Long ke int %s   : %d%n","",i);
		System.out.printf("Int ke short   : %d%n",s);
		System.out.printf("short ke byte  : %d",b);
    }
}
