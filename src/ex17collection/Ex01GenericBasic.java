package ex17collection;

//오랜지를 표현한 클래스
class Orange{
	int  sugar;
	public Orange(int sugar) {
		this.sugar=sugar;
	}
	public void showInfo() {
		System.out.println("오랜지의 당도는 "+sugar+"입니다");
	}
}
//오렌지 전용박스 : Orange 객체만 저장할수 있는 클래스
class OrangeBox{
	Orange item;
	public void store(Orange item) {
		this.item=item;
	}
	public Orange pullOut() {
		return item;
	}
}
//과일상자: Object 기반으로 모든 객체를 저장할수 있는 클래스
class FruitBox{
	Object item;
	public FruitBox(Object item) {
		this.item=item;
	}
	public void store(Object item) {
		this.item=item;
	}
	public Object pullOut() {
		return item;
	}
	
}
public class Ex01GenericBasic {

	public static void main(String[] args) {
		/*
		 박스에 Orange객체를 생성해서 저장후 정보출력
		 */
		OrangeBox oBox1=new OrangeBox();
		Orange orange1=new Orange(10);//당도 10인 오렌지
		oBox1.store(orange1);
		orange1 =oBox1.pullOut();
		orange1.showInfo();
		
		/*
		 상자1은 오렌지 전용박스이므로 다른과일 (즉 객체)을 저장할수 없다
		 컴파일 에러가 발생하므로 실행자체가 불가능하다.
		 ->자료형에는 안전하지만 구현에는 불편함이 따른다
		 다른객체를 저장하기 위해서는 또다른 Box클래스를 생성해야한다
		 */
		/*oBox1.store("당도가 20인 오렌지"); <- 컴파일 에러
		Orange orange2= oBox1.pullOut();
		orange2.showInfo();*/
		
		/*
		 Object를 기반으로 한FruitBox는 구현에는 편리하나 코드레벨에서
		 컴파일 에러가 발생하지 않으므로 오류를 찾아내기가 훨씬 더 힘들다
		 따라서 자료형에 안전하지 못한 코드가 된다.
		 */
		FruitBox fBox1= new FruitBox(new Orange(20));
		Orange orange3=(Orange)fBox1.pullOut();
		orange3.showInfo();
		
		
		FruitBox fBox2=new FruitBox("당도가 30인 오렌디");
		Orange orange4=(Orange)fBox2.pullOut();// <-런타임에러(예외)발생
		orange4.showInfo();
	}

}
