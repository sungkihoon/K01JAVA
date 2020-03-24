package ex09package.kosmo.buyer;

/*
 FruitSeller4 클래스는 외부 패키지에 정의되어 있으므로 반드시 import해야한다.
 */
import ex09package.kosmo.seller.*;

//구매자를 표현한 클래스
public class FruitBuyer4{
	int myMoney;//보유한 금액
	int numOfApple;//구매한 사과의 갯수

	public FruitBuyer4(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}

	//구매자가 판매자에게 사과를 구매하는 행위를 표현한 멤버메소드
	public void buyApple(FruitSeller4 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}

	public void showBuyResult() {
		System.out.println("[구매자]현재잔액 : "+myMoney);
		System.out.println("[구매자]사과갯수 : "+numOfApple);
	}
}