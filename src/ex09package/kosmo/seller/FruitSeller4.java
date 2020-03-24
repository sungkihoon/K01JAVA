package ex09package.kosmo.seller;

//과일 판매자를 추상화한 클래스
public class FruitSeller4{
	int numOfApple;//판매자의 사과 보유갯수
	int myMoney;//판매수익
	final int APPLE_PRICE;

	public FruitSeller4(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;// <= 생성자 내에서는 상수를 초기화할 수 있음.
	}

	public int saleApple(int money) {
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은 사과갯수 : "+numOfApple);
		System.out.println("[판매자]판매수익 : "+myMoney);
	}
}