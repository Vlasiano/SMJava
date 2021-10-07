/*
 * 실수(Double) : 배정도 실수
 * 크기 : 8byte(64bit) = 부호(1bit) + 지수(11bit) + 가수(52bit)
 * 범위 : 4.9E-324 ~ 1.7976931348623157E308
 * 최대 소수점 16자리까지
 * 
 * 
 */

public class DoubleType {

	public static void main(String[] args) {
		
		double db = 0.12345678901234567;
		double d1 = 3.141592712345678; // 16
		double d2 = 3.14159271234567891; // 17
		double d3 = 3.141592712345678912; // 18
		double d4 = 3.1415927123456789123; // 19
		
		System.out.println("db : "+ db);
		System.out.println("d1 : "+ d1);
		System.out.println("d2 : "+ d2);
		System.out.println("d3 : "+ d3);
		System.out.println("d4 : "+ d4);
		
		double n7a = 1234567.0;
		double n7b = 0.1234567e7;
		
		System.out.println("n7a : "+ n7a);
		System.out.println("n7b : "+ n7b);
		
		double n10 = 40000000000.0;
		
		System.out.println("n10 : " + n10);

	}

}
