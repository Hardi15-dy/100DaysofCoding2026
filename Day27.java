public class day27 {
    public static void main(String[] args) {
        //Day 27
		//Operator increment dan decrement

        
        // --- CONTOH INCREMENT ---
        System.out.println("=== INCREMENT ===");
        
        int a = 5;
        // Prefix: langsung mencetak hasil aritmatika (5 + 1 = 6)
        System.out.println("Prefix");
        System.out.println("Nilai a sebelum di incrment : "+a);
        System.out.println("Nilai ++a : " + (++a)); // Output: 6
        
        int b = 5;
        // Postfix: belum menambahkan 1 saat dicetak, jadi masih 5
        System.out.println("Postfix");
        System.out.println("Nilai b sebelum di incrment : "+b);
        System.out.println("Nilai b++ : " + (b++)); // Output: 5
        System.out.println("Nilai b saat ini : " + b); // Output: 6
        
        
        // --- CONTOH DECREMENT ---
        System.out.println("\n=== DECREMENT ===");
        
        int c = 10;
        // Prefix: aritmatika langsung dilakukan (10 - 1 = 9)
        System.out.println("Prefix");
        System.out.println("Nilai c sebelum di incrment : "+c);
        System.out.println("Nilai --c : " + (--c)); // Output: 9
        
        int d = 10;
        // Postfix: d dicetak dulu (masih 10), lalu dikurangi 1
        System.out.println("Postfix");
        System.out.println("Nilai d sebelum di incrment : "+d);
        System.out.println("Nilai d-- : " + (d--)); // Output: 10
        System.out.println("Nilai d saat ini : " + d); // Output: 9
    }
}
