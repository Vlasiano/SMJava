/*
 * +127은 2진수로 0(부호비트임)111 1111
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
		 * int kplus=plus+1; = byte kplus =(byte)(plus+1;) 전자는 128로 입력되지만 후자로 작성하면 -128로 되는데 그것은 바이트의 특성 떄문에 그러함
		 */
		System.out.println("plus(127+1):" + kplus);
		
		byte nminus=(byte)(minus-1);
		System.out.println(nminus);
		//위 아래 비교
		int newminus = minus - 1;
		System.out.println(newminus);
		

	}

}
