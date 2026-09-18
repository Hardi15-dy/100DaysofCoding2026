public class day18 {
    public static void main(String[] args) {
        //Day 18
		
	    byte a = 10; //1 byte
	    short x = a; //2 byte
		int b = x; //4 byte
		long c = b; //8 byte
		float f = c; //4 byte
		double d = f; //8 byte
		
		System.out.printf("Ini byte             : %d%n",a);
		System.out.printf("Ini byte ke Short    : %d%n",x);
		System.out.printf("Ini Short ke Integer : %d%n",b);
		System.out.printf("Ini Integer ke Long  : %d%n",c);
		System.out.printf("Ini Long ke float    : %f%n",f);
		System.out.printf("Ini float ke double  : %f",d);
    }
    
}
