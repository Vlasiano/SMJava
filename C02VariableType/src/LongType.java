/*
 * ����(long): ������ ����
 * 8����Ʈ(64��Ʈ)
 * ����: -9,223,373,036,854,775,808 ~ 9,223,373,036,854,775,807
 * ���� �����ҋ� int ���� �ȿ� ������ ���ڸ� ������ �� ����.
 * �׷��� int ������ �Ѿ�� ���� ���� L�� �Է�
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
