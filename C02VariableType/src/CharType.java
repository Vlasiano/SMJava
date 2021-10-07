/*
 * ���� Ÿ��(char)
 * �ϳ��� ���� ó�� ����
 * ũ��:2byte
 * ����: 0 ~ 65535
 * �����ڵ�(Unicode) ó�� ASCII(0~127), Ȯ�� ASCII(0~255)
 * ���� ����ǥ�� ������ ���Ѵ�.
 */
public class CharType {

	public static void main(String[] args) {
		
		char chA = 'A';
		char cha = 'a';
		char hangeul = '한';

		System.out.println("chA:" + chA);
		System.out.println("cha:" + cha);
		System.out.println("hangeul:" + hangeul);
		
		char chA1 = 65;
		char chA2 = 0x41;
		char chA3 = 0x0041;
		
		System.out.println("chA1:" + chA1);
		System.out.println("chA2:" + chA2);
		System.out.println("chA3:" + chA3);
		
		// �����ڵ�: ��
		char hanunicode = '\uac00';
		System.out.println("hanunicode:" + hanunicode);
		
		// 16���� : '��'
		char hanunicode2 = 0xac00;	
		System.out.println("hanunicode2:" + hanunicode2);
		
		// 10���� : '��'
		char hanunicode3 = 44032;
		System.out.println("hanunicode3:"+hanunicode3);
		
		
		

	}

}
