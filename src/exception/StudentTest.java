package exception;

import logging.MyLogger;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = null;
		MyLogger logger = MyLogger.getLogger();
		
		try{
			Student student = new Student(name);
			System.out.println(student.name);
		} catch(StudentNameFormatException e){
			System.out.println(e.getMessage());
			logger.warning(e.getMessage());
		}
		
		try{
			Student student = new Student("a b c d");
			System.out.println(student.name);
		} catch(StudentNameFormatException e){
			System.out.println(e.getMessage());
			logger.warning(e.getMessage());
		}
	}

}
