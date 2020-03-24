package ex06array;

/*
문제 1]
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다.
배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.

int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
int[] counter = new int[4];

실행결과]
counter[0] => 3
counter[1] => 2
counter[2] => 2
counter[3] => 4
*/
public class QuNumberCounter {

	public static void main(String[] args) {
		
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2};
		/*
		 배열을 크기를 지정하여 선언하면 0으로 채워진다.
		 */
		int count1 = 0, count2= 0, count3 = 0, count4 = 0;
		
		for(int i=0;i<answer.length;i++) {
			if(answer[i] ==1) {
				count1 += 1;
			}
			else if(answer[i] ==2) {
				count2 += 1;
			}
			else if(answer[i] ==3) {
				count3 += 1;
			}
			else {
				count4 += 1;
			}
		}
	
		int[] counter = {count1, count2, count3, count4};
		for(int j=0;j<counter.length;j++) {
			System.out.printf("counter[%d] => %d\n",j,counter[j]);
		}
		
	}

}
