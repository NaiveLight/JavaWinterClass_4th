package exception;

import java.io.IOException;
import java.net.Socket;

public class BasicException {

	//log4j.jar << 가장 많이 쓰임
	//또는 java.util.logging 사용
	
	/*자바의 Runtime에러
	 * Error handling -> 프로그램이 비 정상적으로 멈추지 않도록 함.
	 * 					 따라서 로그를 남겨 추후 원인을 찾을 수 있도록 한다.
	 * 
	 * Exception 발생 경우 -> 파일 I/O, 네트워크 작업, 데이터베이스 연동, 클래스 load 실패, 연산의 수행범위가 벗어나거나 zero로 나누는 연산 발생
	 *
	 * Throwable GP 클래스 
	 */
	public static void main(String[] args) throws IOException {
	
		String greetings[] = {"안녕하세요", "hello", "hi"};
		Socket socket = new Socket();
				
			for (int i=0; i<4; i++){
				try{
					System.out.println(greetings[i]);
					System.out.println("=======");
					
					socket.getOutputStream();
					
				}catch(Exception e){
					System.out.println(e);
					
				}finally{
					System.out.println("finally");
					socket.close();
				}
			}
			System.out.println("aaaaa");	
	}

}
