/*
 * FLOAT는 최대 8자리 수 까지 유효
 * 가수: M
 * 지수: E
 * 값 = M*E^n
 */
public class FloatType2 {

	public static void main(String[] args) {
		
		float f1 = 123450000.0f;
		float f2 = 1.2345E8f;    // E
		float f3 = 1.2345e8f;    // e
		float f4 = 2e-3f;
		
		
		System.out.println("f1:" + f1); //1.2345E8 출력
		System.out.println("f2:" + f2); //1.2345E8 출력
		System.out.println("f3:" + f3);
		System.out.println("f4:" + f4);
		

	}

}
