public class day77 {
    public static void main(String[] args) {
        // Day 77
        // Latihan menggunakan berbagai method String
        String kalimat = "halo nama saya hardi";
        String kalimat2 = "        Saya mahasiswa INSILBAR";


        System.out.println("===== BEfore =====\n");
        System.out.println(kalimat);
        System.out.println(kalimat2);
        
        System.out.println("\n\n");
        
        //Mengubah kalimat menjadi huruf kapital semua
        String besar = kalimat.toUpperCase();

        //Merapikan kalimat ke 2 agar spasi kosong di kiri hilang
        String rapi = kalimat2.trim();

        //Mengubah kata INSILBAR di kalimat ke 2 menjadi UNSULBAR
        String replace = rapi.replace("I", "U");
        
        System.out.println("===== After =====\n");
        System.out.println(besar);
        System.out.println(replace);
    }
}
