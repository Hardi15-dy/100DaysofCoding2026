public class day74 {
    public static void main(String[] args) {
        // Day 74
        // Method dasar String = Length,toUpperCase, dan LowerCase

        String nama = "Halo nama saya Hardi";
        System.out.println("\n"+nama+"\n");

        int l = nama.length();
        String b = nama.toUpperCase();
        String k = nama.toLowerCase();

        // Jumlah karakter dalam variabel nama
        System.out.println("\njumlah karakter dalam kalimat \""+nama+"\" adalah = "+l);

        System.out.println("\n=============================\n");
        // Mengubah ke huruf besar (Uppercase)
        System.out.println("Mengubah semua huruf menjadi besar (Uppercase)");
        System.out.println(b);

        System.out.println("\n=============================\n");
        
        // Mengubah ke huruf kecil (Lowercase)
        System.out.println("Mengubah semua huruf menjadi kecil (Lowercase)");
        System.out.println(k);
    }
}
