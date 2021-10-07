/*
 * String = 문자열 
 * 기본 타입은 아니지만 기본 타입처럼 사용.
 * 문자열 클래스에 해당
 * 문자열을 다루도록 자바에서 기본적으로 제공하는 클래스
 * 문자열은 문자(char)들의 집합에 해당.
 * 큰 따옴표("")로 양 쪽을 묶음.
 * ex) "한글"  
 * ------------------------------------------
 * String은 참조타입.
 * 즉 String 변수는 참조변수에 해당함.
 * String 변수의 각 문자(char)를 개별적으로 바꿀 수가 없음
 * 참조타입: 
 */

public class StringType {

	public static void main(String[] args) {
		
		String empty = ""; // 빈문자열
		String name = "홍길동";
		String alphabet = "abcdef";
		
		System.out.println("empty : " + empty);
		System.out.println("name : " + name);
		System.out.println("alphabet : " + alphabet);
		
	}

}
