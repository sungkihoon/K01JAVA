package ex01start;

/*
아래와 같은 출력결과를 보이는 업그레이드 구구단 프로그램을 작성하시오.
Class Name : QuUpgradeGuGu.java
---------- java ----------
2 x 1 = 2
2 X 2 = 4
2 X 2 X 2 = 8
2 X 2 X 2 X 2 = 16
2 X 2 X 2 X 2 X 2 = 32
2 X 2 X 2 X 2 X 2 X 2 = 64
2 X 2 X 2 X 2 X 2 X 2 X 2 = 128
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 256
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 512
3 X 1 = 3
3 X 3 = 9
3 X 3 X 3= 27
………중간 생략………
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 43046721
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 387420489
출력 완료 (0초 경과) - 정상 종료

 */
public class LvTest {

	public static void main(String[] args) {


		for(int i=2;i<=9;i++) {//곱해지는 수

			for(int j=1;j<=9;j++) {

				if(j==1) {
					System.out.printf("%d X %d = %d\n",i,j,(i*j));
				}
				else {
					int sum=1;//합계
					for(int k=1;k<=j;k++) {//곱할갯수
						sum *= i; 
						if(k==j) {
							System.out.printf("%d", i);
						}
						else {
							System.out.printf("%d X ", i);
						}
					}
					System.out.printf(" = %d\n",sum);

				}
			}
		}
	}
}
