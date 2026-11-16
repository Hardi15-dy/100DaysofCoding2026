public class day76 {
    public static void main(String[] args) {
        // Day76
        // Manipulasi String menggunakan : substring(),replace(), dan trim();

        String kalimat = "Saya Hardi menyukai Coding";

        System.out.print("\nTeks awal :");
        System.out.println(kalimat+"\n\n");
        System.out.println("===== Substring() =====");
        // Menampilkan kalimat dari index 5 sampai akhir
        String hasil1 = kalimat.substring(5);
        // Menampilkan kalimat dari index 5 sampai index 20
        String hasil2 = kalimat.substring(5, 20);
        System.out.println(hasil1+",(Menampilkan kalimat dari index 5 sampai akhir)");
        System.out.println(hasil2+",(Menampilkan kalimat dari index 5 sampai index 20)");

        System.out.println("\n\n");
        
        System.out.println("===== replace() =====");
        // mengganti kata yang ada dalam String kalimat
        System.out.println("Kalimat awal sebelum di ganti (Teks di ganti) \n" + kalimat);
        String gantikata = kalimat.replace("Coding", "Stres");
        System.out.println("Setelah di ganti :\n"+gantikata);
        System.out.println();
        // mengganti huruf yang ada dalam String kalimat
        System.out.println("Kalimat awal sebelum di ganti (Huruf di ganti)\n" + kalimat);
        String gantiHuruf = kalimat.replace("o", "a");
        System.out.println("Setelah di ganti :\n"+gantiHuruf);
        
        System.out.println("\n\n");

        System.out.println("===== trim() =====");
        //Menghapus spasi kosong di kiri dan kanan kalimat(spasi bagian tengah tidak termasuk)
        String nama = "    Hardy";
        System.out.println("Sebelum di trims : "+nama);
        String bersih = nama.trim();
        System.out.println("Sedudah di trims : "+bersih);
        
    }
}
