package ex18lambda;

/*
 람다식(Lambda Expression)
 	:객체지향에서는 메소드를 사용하기 위해서는 반드시
 	클래스를 정의한후 메소드를 선언해야한다. 
 	이러한 불편함 떄문에 최근 함수형프로그래밍의 장점이 대두되었고
 	이러 단점을 보완하기위해 JDK1.8부터 지원하게 되었다.
 */
/*
 람다식으로 구현하기
 */
interface IKosmo3{
	void studyLambda(String str);
}

public class Ex03Lambda {

	public static void main(String[] args) {
		/*
		 2번 예제 익명플래스를 람다식으로 표현하면 아래와 같다
		 */
		IKosmo3 kosmo1 =(String str) -> {
			System.out.println(str+ "을 드디어 써보네요!!");
		};
		kosmo1.studyLambda("람다식");
		
		/*
		 위의 람다식을 아래와 같이 한번더 줄이는게 가능함
		 -매개변수의 타입을 예상할수 있다면 생략가능
		 -매개변수가 하나라면 소괄호 생략가능
		 -실행할 문장이 하낙 동시에 return문이 
		 	아니라면 중괄호 생략가능
		 */
		IKosmo3 kosmo2= str->System.out.println(str+" 완전 간단!!");
		kosmo2.studyLambda("람다식");
	}
	

}
