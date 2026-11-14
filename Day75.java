public class day75 {
    public static void main(String[] args) {
        // Day 75
        // Method String untuk Pengecekan. equals(),equalIgnore(), contains(),
        // isEmpty();

        String n1 = "Hardy";
        String n2 = "Hardy";
        String nama = "Nama saya adalah Hardy";
        String sk = " ";
        String s = "";

        boolean nmt = n1.equals(n2);
        boolean nmf = n1.equals(nama);

        boolean nm1 = n1.equalsIgnoreCase(n2);
        boolean nm2 = n1.equalsIgnoreCase(nama);

        boolean con = nama.contains("Hardy");
        boolean con1 = nama.contains("python");

        boolean skk = sk.isEmpty();
        boolean ss = s.isEmpty();

        System.out.println("\n===== KALIMAT ====");
        System.out.println(""+nama+"\n\n");

        System.out.println("===== equals =====");
        System.out.printf("Nilai dari variabel \"%s\" equals \"%s\" Adalah : \"%s\"%n", n1, n2, nmt);
        System.out.printf("Nilai dari variabel \"%s\" equals \"%s\" Adalah : \"%s\"%n%n%n", n1, nama, nmf);

        System.out.println("===== equalIgnore =====");
        System.out.printf("Nilai dari variabel \"%s\" equalIgnore \"%s\" Adalah : \"%s\"%n", n1, n2, nm1);
        System.out.printf("Nilai dari variabel \"%s\" equalIgnore \"%s\" Adalah : \"%s\"%n%n%n", n1, nama, nm2);

        System.out.println("===== contains =====");
        System.out.printf("Apakah ada teks \"%s\" dalam variabel nama yaitu \"%s\" : \"%s\"%n", "Hardy", nama, con);
        System.out.printf("Apakah ada teks \"%s\" dalam variabel nama yaitu \"%s\" : \"%s\"%n%n%n", "python", nama, con1);

        System.out.println("===== isEmpty =====");
        System.out.printf("Apakah ada ada karakter dalam variablel \"%s\" = %s%n", sk, skk);
        System.out.printf("Apakah ada ada karakter dalam variablel \"%s\" = %s", s, ss);

    }
}
