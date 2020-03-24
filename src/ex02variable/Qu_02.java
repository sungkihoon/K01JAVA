package ex02variable;

/*
 문제2] 파일명 : Qu_02.java
국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
출력결과]
	99점,80점,96점의 평균점수는 XXX.XX점입니다.(실수형태)
	99점,80점,96점의 평균점수는 XXX점입니다.(정수형태)

 */
public class Qu_02 {

	public static void main(String[] args) {
		
		double kor = 99, eng = 80, mat = 96;
		double avg1 = (kor+eng+mat)/3;
		int avg2;

		System.out.printf("99점, 80점, 96점의 평균점수는 %f점입니다. \n", avg1);
		avg2 = (int)avg1;
		System.out.printf("99점, 80점, 96점의 평균점수는 %d점입니다. \n", avg2);
	}

}
