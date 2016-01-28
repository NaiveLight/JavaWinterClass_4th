package exception;

import logging.MyLogger;

public class Student {
	
	String name;
	MyLogger logger = MyLogger.getLogger();
	
	public Student(String name){
		
		logger.fine("begin Student()");
		
		if(name == null){
			throw new StudentNameFormatException("이름이 null 입니다.");
		}		
		
		if(name.split(" ").length > 3){
			throw new StudentNameFormatException("이름이 너무 깁니다.");
		}
		
		this.name = name;
	}
}
