public class day2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("\n\n\n");
        String nama, NIM, alamat, wa;
        nama = "HARDI";
        NIM = "D0226020";
        alamat = "BTN GRIYA LEMBANG,LEMBANG";
        wa = "0851 7898 7605";
        
        //ini bagian println
        System.out.println("===== Biodata =====");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Alamat: " + alamat);
        System.out.println("WhatsApp: " + wa);


        System.out.println("\n\n\n");
        
        //ini bagian print
        System.out.print("===== Biodata =====\n");
        System.out.print("Nama: " + nama + "\n");
        System.out.print("NIM: " + NIM + "\n");
        System.out.print("Alamat: " + alamat + "\n");
        System.out.print("WhatsApp: " + wa + "\n");
        
        System.out.println("\n\n\n");

        //ini bagian printf
        System.out.printf("===== Biodata =====\n");
        System.out.printf("Nama: %s\n", nama);
        System.out.printf("NIM: %s\n", NIM);
        System.out.printf("Alamat: %s\n", alamat);
        System.out.printf("WhatsApp: %s\n", wa);

    }
}
