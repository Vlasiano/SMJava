/*
 * ������ ����(short)
 * 2����Ʈ(16��Ʈ)
 * ����:-32768 ~ 32767
 * 
 */
public class ShortType {

	public static void main(String[] args) {
		short minshort = -32768;
		short maxshort = 32767;
		short abc = 12345;
		
		System.out.println("minshort: " + minshort);
		System.out.println("maxshort: "+ maxshort);
		System.out.println(abc);
		/*
		short maxone =(short) (maxshort+1); //int maxone = maxshort+1�� �ᵵ ���� ����.
		System.out.println("maxshort+1: " + (maxshort+1));
		System.out.println("maxone:" + maxone);
		*/
		
		short k =(short)(maxshort +1);
		System.out.println(k);
		
		int m = maxshort +1;
		System.out.println(m);
	}

}
