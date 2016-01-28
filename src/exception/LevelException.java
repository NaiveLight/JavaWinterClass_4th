package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LevelException {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt"); //path ���� �� ���� project �������� ã�´�.
			String greetings[] = {"�ȳ��ϼ���", "hello", "hi"};
			System.out.println(greetings[3]);
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e){
			System.out.println(e);
		} finally{
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		
	}

}
