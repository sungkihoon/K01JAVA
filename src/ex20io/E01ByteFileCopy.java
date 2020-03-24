package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 스트림(Stream)
 	:IO모델의 핵심개념이라 할수있는 스트림은 '데이터의 흐름'
 	혹은 테이터의 흐름을 형성해주는 통로 정도로 정의할 수 있다
 	입력(Input)스트림과 출력(Output)스트림으로 나눌수있다
 */
public class E01ByteFileCopy {
	/*
	 IO관련 작업에서 많은 부분에서 예외처리가 필요하다.
	 이때 예외를 throws하는것보다 try~catch로 예외처리를
	 해주는것을 권장하고 있다. 예외를 무시하게되면 문제가
	 생겼을때 적절한 조치를 취하기 힘들기 때문이다.
	 */
	public static void main(String[] args) {
		InputStream in =null;
		OutputStream out= null;
		int copyByte=0;
		try {
			in =new FileInputStream("src/ex20io/A38Http2.zip");
			out = new FileOutputStream("src/ex20io/A38Http2_copy.zip");
			while(true) {
				int bData=in.read();
				if(bData==-1) {
					break;
				}
				out.write(bData);
				copyByte++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
		}catch(IOException e){
			System.out.println("파일스트림 생성시 오류발생");
		}
		finally {
			try {
				in.close();
				out.close();
				System.out.println("복사된 Byte크기: "+(copyByte/1024));
			} catch (IOException e2) {
				System.out.println("파일스트림닫기오류");
			}
		}
	}

}
