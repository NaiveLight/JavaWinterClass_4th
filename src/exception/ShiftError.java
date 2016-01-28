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
		//throws exception을 main에 걸면 JVM으로 넘어가고 프로그램이 죽는다. 
		ShiftError sh = new ShiftError();
		try {
			sh.makeURL("a.txt", "htttp://www.naver.com");
		} catch (FileNotFoundException | MalformedURLException e) {
			System.out.println(e);
		}
	}

}
