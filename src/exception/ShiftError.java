package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class ShiftError {

	public URL makeURL(String filename, String url) throws FileNotFoundException, MalformedURLException{
		FileInputStream fis = new FileInputStream(filename);
		return new URL(url);
	}
	
	public static void main(String[] args) {
		//throws exception�� main�� �ɸ� JVM���� �Ѿ�� ���α׷��� �״´�. 
		ShiftError sh = new ShiftError();
		try {
			sh.makeURL("a.txt", "htttp://www.naver.com");
		} catch (FileNotFoundException | MalformedURLException e) {
			System.out.println(e);
		}
	}

}
