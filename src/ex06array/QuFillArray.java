package ex06array;

/*파일명 : QuFillArray.java



길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서 부터 채워나가고
 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)

출력예시) 총 10개의 정수를 입력하시오.
1 2 3 4 5 6 7 8 9 10

순서대로입력된결과: 1 2 3 4 5 6 7 8 9 10
홀수/짝수 구분입력결과 : 1 3 5 7 9 10 8 6 4 2
*/

import java.util.Scanner;
public class QuFillArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr1 = new int[10];//순서대로
		int[] arr2 = new int[10];//홀수짝수
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = scan.nextInt();
		}
		
		for(int k=0;k<arr2.length;k++) {
			if(arr1[k]!=0) {
				arr2[k] = arr1[k];
			}
			else {
				arr2[(arr2.length-1)-k] = arr1[k];
			}
		}
		
		System.out.print("순서대로 입력된 결과 : ");
		
		for(int j=0;j<arr1.length;j++) {
			System.out.print(arr1[j]);
		}
		System.out.println();
		System.out.print("홀수/짝수 구분입력결과 : ");
		for(int m=0;m<arr1.length;m++) {
			System.out.print(arr2[m]);
		}
	}

}
