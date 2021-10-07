/*
 * 16진수 : 0 ~ 15. 10(A) , 11(B), 12(C), 13(D), 14(E) , 15(F)
 * 표현: 0x
 * 
 */
public class HexaDecimal {

	public static void main(String[] args) {
		
		int dc = 10;
		int ha = 0xa;

		System.out.println(dc);
		System.out.println(ha);
		
		int a = 0xa;
		int b = 0xb;
		int c = 0xc;
		int d = 0xd;
		int e = 0xe;
		int f = 0xf;
		
		System.out.println("a : " + a);
		System.out.println("b : " +b);
		System.out.println("c : " +c);
		System.out.println("d : " +d);
		System.out.println("e : " +e);
		System.out.println("f : " +f);
		
		System.out.println(">16진수 출력<");
		System.out.printf("hexa(0xa) : %d, 0x%x\n", a, a);
		System.out.printf("hexa(0xb) : %d, 0x%x\n", b, b);
		System.out.printf("hexa(0xc) : %d, 0x%x\n", c, c);
		System.out.printf("hexa(0xd) : %d, 0x%x\n", d, d);
		System.out.printf("hexa(0xe) : %d, 0x%x\n", e, e);
		System.out.printf("hexa(0xf) : %d, 0x%x\n", f, f);
		
		

	}

}
