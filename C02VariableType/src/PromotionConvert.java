/*
 * 자동타입변환(promotion)
 * 작은 타입에서 큰 타입으로 변환
 * 문자형(char)은 양수값만 가지기 처리하기 떄문에 byte의 마이너스 값을 캐스팅하게 되면 오류가 발생하고 플러스로 바뀜
 * 
 */
public class PromotionConvert {

	public static void main(String[] args) {
		byte b1 = 65;
		int n1 = b1; //자동으로 캐스팅 됨
		
		System.out.println("b1:"+ b1);
		System.out.println("n1:" + n1);
		
		char ca = 65;
		int na = ca;
		
		System.out.println("ca :" + ca);
		System.out.println("na :" + na);
		
		
		// char c1 = b1;는 오류 발생함. char가 더 큰데도 안됨. 왜?
		// char는 마이너스를 다루지 않음. 크기는 2바이트로 byte보단 크지만 마이너스를 다루지 않기 떄문 
		// 그래서 char c1=(char)b1; 으로 처리함
		

	}

}
