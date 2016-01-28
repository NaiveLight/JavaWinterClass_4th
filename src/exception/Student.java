package exception;

import logging.MyLogger;

public class Student {
	
	String name;
	MyLogger logger = MyLogger.getLogger();
	
	public Student(String name){
		
		logger.fine("begin Student()");
		
		if(name == null){
			throw new StudentNameFormatException("�̸��� null �Դϴ�.");
		}		
		
		if(name.split(" ").length > 3){
			throw new StudentNameFormatException("�̸��� �ʹ� ��ϴ�.");
		}
		
		this.name = name;
	}
}
