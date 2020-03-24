package ex06array;

public class E05TwoDimArray01 {

   public static void main(String[] args) {
      
      int[][] arr= {
            {1,2}, {3,4,5}, {6,7,8,9}
      };
      /*
       2차원배열에서 배열명.length 출력하면 세로값
       */
      System.out.println("배열의 세로크기: "+arr.length);
      System.out.println("배열명이 가진 값 출력 arr:"+arr);
      /*
       각행의가로크기는 초기화된 상태에 따라 다를수있다
       0행은 2, 2행은 4의 크기를 출력하게된다
       */
      for(int i=0;i<arr.length;i++) {
         System.out.printf("%d행의 크기 %d\n",i,arr[i].length);
         System.out.printf("%d행 출력 : %s\n",i,arr[i]);
      }
      
      System.out.println("배열 출력하기");
      System.out.println("arr[0][1]="+arr[0][1]);
      //System.out.println("arr[0][3]="+arr[0][3]); //예외발생
      
   }

}