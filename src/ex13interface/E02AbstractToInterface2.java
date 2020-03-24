package ex13interface;
/*
추상클래스를 interface로 변경하기
   abstract class => interface

   메소드의 경우 public abstract를 제거

   멤버상수인 경우 public static final을 제거
 */

//프로젝트 전체에서 기준이 될수있는 추상클래스 정의
interface PersonalNumberStorageInter{
	void addPersonlInfo(String juminNum, String name);
	String searchPersonalInfo(String juminNum);
}
/*
 사람의 정보를 저장할 용도의 DTO클래스 혹은 VO클래스라고 한다
 */
class PersonalInfoVO{
	private String name;
	private String juminNum;

	public PersonalInfoVO(String name, String juminNum) {
		super();
		this.name = name;
		this.juminNum = juminNum;
	}
	public String getName() {
		return name;
	}
	public String getJumin() {
		return juminNum;
	}
}

/*
클래스가 클래스를 상속받을때 extends사용
클래스가 인터페이스를 상속받을때 implements사용
인터페이스가 인터페이스를 상속 받을때 extends사용

extends는 '상속'이라 표현하고 implements는 '구현'이라 표현한다
 */
class PersonalNumberStorageImpl implements PersonalNumberStorageInter{
	//멤버변수 
	PersonalInfoVO[] personalArr;
	int numOfPerInfo;
	//생성자
	public PersonalNumberStorageImpl(int arrSize) {
		personalArr =new PersonalInfoVO[arrSize];
		numOfPerInfo=0;
	}

	/*
    전달받은 인자를 통해 PersonalInfoDTO객체를 생성후 객체 배열에 저장
	 */
	@Override
	public void addPersonlInfo(String juminNum, String name) {
		personalArr[numOfPerInfo]=
				new PersonalInfoVO(name, juminNum);
		numOfPerInfo++;
	}

	/*
   주민번호를 이자로 전달받아 객체배열에 저장된 정보를 검색한후
   일치하는 경우레만 이름을 반환한다.
	 */
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i=0; i<numOfPerInfo;i++) {
			if(juminNum.compareTo(personalArr[i].getJumin())==0) {
				return personalArr[i].getName();
			}
		}
		return null;
	}
}

public class E02AbstractToInterface2 {

	public static void main(String[] args) {
		PersonalNumberStorageInter storage= new PersonalNumberStorageImpl(10);
		storage.addPersonlInfo("901234-2222222", "김태희");
		storage.addPersonlInfo("901234-1111111", "정지훈");

		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
	}
}