package ex08class;

/*
 - 내가 짠 코드 
 class Triangle{

	int sum, height, bottom;

	double getArea() {
		sum = height*bottom/2;
		return sum;
	}

	int setBottom(int bot) {
		bottom = bot;
		return bottom;
	}

	int setHeight(int hei) {
		height = hei;
		return height;
	}

	void init(int hei, int bot) {
		height = hei;
		bottom = bot;
	}

}*/

class Triangle{

	int bottom;//밑변
	int height;//높이

	//밑변과 높이를 초기화하는 메소드
	public void init(int bot, int hei){
		bottom = bot;
		height = hei;
	}

	//삼각형의 넓이를 계산해서 반환하는 메소드
	public double getArea() {
		return bottom * height * 0.5;
	}

	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}

public class QuTriangle {

	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}


}
