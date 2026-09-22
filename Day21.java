public class day21 {
    public static void main(String[] args) {
        //Day 21
        // Mengubah data String ke data primitif

        String umur = "20";
        String tinggi = "170.5";
        String kelamin = "Ldhyshf";
        String b = "true";
        String berat = "48.7";

        System.out.println("===== Sebelum diubah =====");
        System.out.println("Umur dalam bentuk String              : " + umur);
        System.out.println("Tinggi dalam bentuk String            : " + tinggi);
        System.out.println("Kelamin dalam bentuk String           : " + kelamin);
        System.out.println("Status Mahasiswa dalam bentuk String  : " + b);
        System.out.println("Berat dalam bentuk String             : " + berat);

        System.out.println("\n===== Setelah diubah =====");
        int umurInt = Integer.parseInt(umur);
        System.out.println("Umur dalam bentuk integer             : " + umurInt);

        double tinggiDouble = Double.parseDouble(tinggi);
        System.out.println("Tinggi dalam bentuk double            : " + tinggiDouble);

        char Char = kelamin.charAt(0);
        System.out.println("Kelamin dalam bentuk char             : " + Char);

        boolean bBoolean = Boolean.parseBoolean(b);
        System.out.println("Status Mahasiswa dalam bentuk boolean : " + bBoolean);

        float f = Float.parseFloat(berat);
        System.out.println("Berat dalam bentuk Float              : " + f);
    }
}
