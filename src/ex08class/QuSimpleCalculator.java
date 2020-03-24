package ex08class;

class CalculatorEx{
	
	//멤버변수 : 연산의 횟수를 카운트할 용도로 사용
	
	int addC, minC, mulC, divC;
	double sum;

	public double add(double num1, double num2){
		sum = num1 + num2;
		addC++;
		return sum;
	}

	public double min(double num1, double num2) {
		sum = num1 - num2;
		minC++;
		return sum;
	}

	public double mul(double num1, double num2) {
		sum = num1 * num2;
		mulC++;
		return sum;
	}

	public double div(double num1, double num2) {
		sum = num1 / num2;
		divC++;
		return sum;
	}

	public void init() {
		addC = 0;
		minC = 0;
		mulC = 0;
		divC = 0;
	}

	public void showOpCount() {
		
		
		System.out.println("덧셈횟수 : "+addC);
		System.out.println("뺄셈횟수 : "+ minC);
		System.out.println("곱셈횟수 : "+mulC);
		System.out.println("나눗셈횟수 : "+divC);
	}


}

public class QuSimpleCalculator {

	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}	


}
