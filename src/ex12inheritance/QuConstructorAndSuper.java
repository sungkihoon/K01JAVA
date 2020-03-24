package ex12inheritance;

/*문제1) 파일명 :  QuConstructorAndSuper.java
       상속관계에 놓여있는 클래스의 생성자 정의 및 호출방식을 기본으로 다음 클래스의 적절한 생성자를 삽입해보자.
       그리고 이의 확인을 위한 main 메소드도 적절히 정의해보자.

       실행결과]
       남은가솔린:10
       남은전기량:20
       남은워터량:30*/

class Car {
	int gasoline;

	Car(int gasoline){
		this.gasoline = gasoline;
		System.out.println("Car 생성자 호출");
	}
}

class HybridCar extends Car {
	int electric;

	//생성자
	HybridCar(int gasoline, int electric){
		//부모클래스로 gasoline을 전달하여 생성자 호출
		super(gasoline);
		this.electric = electric;
		System.out.println("HybridCar 생성자 호출");
	}
}

class HybridWaterCar extends HybridCar {
	int water;

	//생성자
	HybridWaterCar(int gasoline, int electric, int water){
		//부모클래스로 gasoline, electric을 전달하여 생성자 호출
		super(gasoline, electric);
		this.water = water;
		System.out.println("HybirdWaterCar 생성자 호출");
	}

	public void showNowGauge() {
		System.out.println("남은가솔린:" + gasoline);
		System.out.println("남은전기량:" + electric);
		System.out.println("남은워터량:" + water);
	}
}

public class QuConstructorAndSuper {
	public static void main(String[] args) {
		HybridWaterCar hcar = new HybridWaterCar(10, 20, 30);
		hcar.showNowGauge();
	}
}
