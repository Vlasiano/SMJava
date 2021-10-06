/*
 * 정수(long): 배정도 정수
 * 8바이트(64비트)
 * 범위: -9,223,373,036,854,775,808 ~ 9,223,373,036,854,775,807
 * 값을 지정할떄 int 밤위 안에 있으면 숫자를 지정할 수 있음.
 * 그러나 int 범위를 넘어서면 숫자 끝에 L을 입력
 */
public class LongType {

	public static void main(String[] args) {
		
		long intmax = 2147483647;
		long intmaxplus = 2147483648L;
		
		System.out.println("intmax:" + intmax);
		System.out.println("intmaxplus:" + intmaxplus);
		
		long longval = (long) (intmax+1);
		long longval2 = intmax+1;
		System.out.println("longval:"+longval);
		System.out.println("longval2:"+longval2);
	}

}
