/*
 * ����Ʈ Ÿ��
 * 1����Ʈ ����: -128~127������ ���� ������ �� �ִ� ������ �ǹ���.
 * �������� Ư��, ���� ó���ϰ��� �ϴ� Ư���� ���缭 ������ �ᳪ���� ��.
 * ""���ڿ��� �ش���. ���α׷��� ������ ���������̶�� ���� �ִµ� �̰��� �پ��� ���·� ��ȯ�� ������.
 * println�� ��� ������ ���ڿ��� ��ȯ���Ѽ� ȭ�鿡 �����ִ� ����.
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
