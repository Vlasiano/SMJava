/*
 * 강제 타입 변환(실수형)
 * 1. 특정한 타입으로 강제 변환
 * 2. 큰 타입에서 작은 타입으로 변환
 * 3. 실수를 정수로 변환시키면 소수점 이하는 버려지고 정수만 취하게 됨
 * 
 */
public class TypeCasting2 {

	public static void main(String[] args) {
		
		float fpi = 3.14159f;
		double dpi = 3.14159;
		
	//오	int pi1 = fpi; 
	//류	int pi2 = dpi; 
		
		int pi1 =(int)fpi;
		int pi2 =(int)dpi;
		
		System.out.println("fpi=" + fpi);
		System.out.println("dpi=" + dpi);
		System.out.println("pi1=" + pi1);
		System.out.println("pi2=" + pi2);
		
		//2147483647
		float fvalue = 0.21e10f;
		int ival =(int)fvalue;
		
		System.out.println("fvalue = " + fvalue);
		System.out.println("ival = " + ival);
		
		//10자리 이상
		
		float f2 = 0.21e12f;
		int i2 = (int) f2;
		
		System.out.println("f2 = " + f2);
		System.out.println("i2 = " + i2);

	}

}
