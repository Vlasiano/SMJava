/*
 * +127�� 2������ 0(��ȣ��Ʈ��)111 1111
 *    +:               1
 *    -------------------
 *             1000 0000(=-128)       
 */
public class ByteType2 {

	public static void main(String[] args) {
		byte minus = -128;
		byte plus = 127;
		
		System.out.println("minus(-128):"+minus);
		System.out.println("plus(127):" + plus);
		
		int kplus= plus + 1;
		
		/*
		 * int kplus=plus+1; = byte kplus =(byte)(plus+1;) ���ڴ� 128�� �Էµ����� ���ڷ� �ۼ��ϸ� -128�� �Ǵµ� �װ��� ����Ʈ�� Ư�� ������ �׷���
		 */
		System.out.println("plus(127+1):" + kplus);
		
		byte nminus=(byte)(minus-1);
		System.out.println(nminus);
		//�� �Ʒ� ��
		int newminus = minus - 1;
		System.out.println(newminus);
		

	}

}
