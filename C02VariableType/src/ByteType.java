/*
 * 바이트 타입
 * 1바이트 단위: -128~127까지의 값을 저장할 수 있는 공간을 의미함.
 * 데이터의 특성, 내가 처리하고자 하는 특성에 맞춰서 변수를 써나가면 됨.
 * ""문자열에 해당함. 프로그래밍 언어에서는 데이터형이라는 것이 있는데 이것이 다양한 형태롭 변환이 가능함.
 * println은 출력 가능한 문자열로 변환시켜서 화면에 보여주는 것임.
 * 10+23=33
 * "10"+"33"=1033
 */

public class ByteType {

	public static void main(String[] args) {
		byte b1 = 0;
		byte minus = -128;
		byte plus = 127;
		byte abc = 123;
		byte x1 = 99;
		
		
		b1 = 11;
	
		byte b4 = b1;
		

		
		System.out.println(b1);
		System.out.println(minus);
		System.out.println(plus);
		System.out.println(abc);
		System.out.println("b4:"+ b4);
	}

}
