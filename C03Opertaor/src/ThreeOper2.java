/*
 * 삼항연산자
 * 변수 = (조건식) ? 참값 : 거짓값
 * 1. 조건식이 참이면 참의 식이 결과 값이 변수에 대입
 * 2. 조건식이 거짓이면 거짓의 결과 값이 변수에 대비
 * ------------------------------------
 * [문제] 삼항 연선자를 시용하여 주어진 값의 등급을 지정하라
 * score : 0부터 100까지 임의의 값에 따라서 A등급부터 F등급까지 출력
 * A: 90점 이상
 * B: 80점 이상
 * C: 70점 이상
 * D: 60점 이상
 * F: 60점 미만
 */

public class ThreeOper2 {

	public static void main(String[] args) {
	
		int score = 56;
		char grade = 'A';
		
		grade = (score >=90) ? 'A' : 
			(score >=80) ? 'B': 
				(score >=70) ? 'C' : 
					(score >=60) ?'D': 'F';
		
		System.out.printf("score(%d), grade(%c)\n", score, grade);
		
		
		
		
	}

}
