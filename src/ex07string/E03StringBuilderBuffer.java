package ex07string;

public class E03StringBuilderBuffer {

	public static void main(String[] args) {
		
		StringBuffer strBuf=new StringBuffer("AB");
		strBuf.append(25);
		strBuf.append("Y").append(true);
		System.out.println("strBuf="+strBuf);
		
		strBuf.insert(2,false);
		strBuf.insert(strBuf.length(), 'Z');
		System.out.println("strBuf=" +strBuf);
		
		System.out.println("String과 StringBuffer의 "+"참조값 비교");
		String str1= "코스모";
		String str2="코스모";
		if(str1==str2)
			System.out.println("연결전: 주소값동일");
		else
			System.out.println("연결전: 주소값다름");
		
		str1 =str2+"영원하라";
		
		if(str1==str2)
			System.out.println("연결후: 주소값동일");
		else
			System.out.println("연결후: 주소값다름");
		StringBuffer buf=new StringBuffer();
		System.out.println("buf="+buf);
		System.out.println("저장된 문자열크기: "+buf.length());
		System.out.println("기본버퍼크기:"+buf.capacity());

		buf.append("KOSMO");
		System.out.println("buf="+buf);
		System.out.println("저장된 문자열크기: "+buf.length());
		System.out.println("기본버퍼크기:"+buf.capacity());
		
		buf.append("금일은 StringBuffer 공부중임").append("오늘은 수욜~~~^^");
		System.out.println("buf="+buf);
		System.out.println("저장된 문자열크기: "+buf.length());
		System.out.println("기본버퍼크기:"+buf.capacity());
		

	}

}
