/*
 * 8진수(oct)
 * 8진수 값은 정수값 앞에 0을 붙인다.
 * 0부터 7까지 
 */
public class OctNumberType {

	public static void main(String[] args) {
		
		int oct0 = 00;
		int oct1 = 01;
		int oct2 = 02;
		int oct3 = 03;
		int oct4 = 04;
		int oct5 = 05;
		int oct6 = 06;
		int oct7 = 07;

		System.out.println(">8진수<");
		
		System.out.printf(" %d, 0%o, 0%o \n", oct0, oct0, oct0);
		System.out.printf(" %d, 0%o, 0%o \n", oct1, oct1, oct1);
		System.out.printf(" %d, 0%o, 0%x \n", oct2, oct2, oct2);
		System.out.printf(" %d, 0%o, 0%x \n", oct3, oct3, oct3);
		System.out.printf(" %d, 0%o, 0%x \n", oct4, oct4, oct4);
		System.out.printf(" %d, 0%o, 0%x \n", oct5, oct5, oct5);
		System.out.printf(" %d, 0%o, 0%x \n", oct6, oct6, oct6);
		System.out.printf(" %d, 0%o, 0%x \n", oct7, oct7, oct7);
		
		// 1바이트 최대값
		int dec=255;
		int oct=0377;
		int hex=0xff;
		
		System.out.printf("dec: %d, 0%0, 0x%x \n", dec, dec, dec);
		System.out.printf("oct: %d, 0%0, 0x%x \n", oct, oct, oct);
		System.out.printf("dec: %d, 0%0, 0x%x \n", hex, hex, hex);
		
		
	}

}
