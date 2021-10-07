/*
 * 강제 타입 변환
 * 1. 특정한 타입으로 강제 변환
 * 2. 큰 타입에서 작은 타입으로 변환하게 되면 자료의 손실이 발생함.
 * 
 */
public class TypeCasting {

	public static void main(String[] args) {

		int intvalue = 300; 
		byte bytevalue =(byte)intvalue; //byte bytevalue = intvalue;는 실행안됨

		System.out.printf("int(%d), (0%x) : byte(%d), (0%x)\n" , intvalue , intvalue , bytevalue , bytevalue);
		
		byte a = 100;
		int b = a;
		
		System.out.println(b);
		
	}

}
