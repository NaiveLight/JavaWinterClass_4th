package exception;

import java.io.IOException;
import java.net.Socket;

public class BasicException {

	//log4j.jar << ���� ���� ����
	//�Ǵ� java.util.logging ���
	
	/*�ڹ��� Runtime����
	 * Error handling -> ���α׷��� �� ���������� ������ �ʵ��� ��.
	 * 					 ���� �α׸� ���� ���� ������ ã�� �� �ֵ��� �Ѵ�.
	 * 
	 * Exception �߻� ��� -> ���� I/O, ��Ʈ��ũ �۾�, �����ͺ��̽� ����, Ŭ���� load ����, ������ ��������� ����ų� zero�� ������ ���� �߻�
	 *
	 * Throwable GP Ŭ���� 
	 */
	public static void main(String[] args) throws IOException {
	
		String greetings[] = {"�ȳ��ϼ���", "hello", "hi"};
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
