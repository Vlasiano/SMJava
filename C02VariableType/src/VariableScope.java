/*
 * 변수의 사용범위
 * 블럭 밖에서는 블럭 안에 선언되어 있는 변수에 접근할 수 없음
 * 블럭 안에서는 블럭 밖에서 선언되어 있는 변수에는 접근할 수 있음.
 * 
 */
public class VariableScope {
	static int g1=99;

	public static void main(String[] args) {
		
		int a1 = 10; // local variable
		System.out.println("main.a1 = " + a1);
		System.out.println("main.g1 = " + g1);
		
		{//block 1
			//중복이라 안됨 int a1 = 33;
			int b1=20;
			System.out.println("block1.a1 = " + a1);
			System.out.println("block1.b1 = " + b1);
			System.out.println("block1.g1 = " + g1);
		
		}
		
		
	}
}
